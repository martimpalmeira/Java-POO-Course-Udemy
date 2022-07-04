package exercises.secao17.practice211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		String path = "/Users/junior/desktop/Arquivos Java/itensVendidos.csv";

		ArrayList<String> srclines = new ArrayList<>();

		ArrayList<String> outlines = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String srcline = br.readLine();
			while (srcline != null) {
				srclines.add(srcline);
				srcline = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (String line : srclines) {
			String[] l = line.split(";");
			Double value1 = Double.valueOf(l[1]);
			Double value2 = Double.valueOf(l[2]);
			Double result = value1 * value2;
			String v = String.valueOf(result);
			outlines.add(l[0] + ";" + v);
		}

		String newFolderPath = "/Users/junior/desktop/Arquivos Java/out";

		boolean success = new File(newFolderPath).mkdir();
		System.out.println("Folder created with success: " + success);

		String newFilePath = newFolderPath + "/summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))) {
			for (String line : outlines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
