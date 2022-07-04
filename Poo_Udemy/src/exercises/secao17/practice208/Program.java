package exercises.secao17.practice208;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "João", "Maria", "Pedro" };

		String path = "/Users/junior/Desktop/Arquivos Java/outro.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for(String l : lines) {
				bw.write(l);
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
