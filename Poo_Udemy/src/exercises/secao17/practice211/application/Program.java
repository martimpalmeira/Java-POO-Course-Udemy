package exercises.secao17.practice211.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import exercises.secao17.practice211.entities.Item;

public class Program {

	public static void main(String[] args) {
		
		String path = "/Users/junior/desktop/Arquivos Java/itensVendidos.csv";
		
		ArrayList<Item> itens = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String srcline = br.readLine();
			while (srcline != null) {
				
				String[] srclineSplit = srcline.split(";");
				String name = srclineSplit[0];
				Double value = Double.valueOf(srclineSplit[1]);
				Integer quantity = Integer.valueOf(srclineSplit[2]);

				Item item = new Item(name, value, quantity);
				
				itens.add(item);
				
				srcline = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		

		String newFolderPath = "/Users/junior/desktop/Arquivos Java/out";

		boolean success = new File(newFolderPath).mkdir();
		System.out.println("Folder created with success: " + success);

		String newFilePath = newFolderPath + "/summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))) {
			for (Item item : itens) {
				bw.write(item.getName()+";"+item.total());
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
