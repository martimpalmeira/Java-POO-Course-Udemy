package exercises.secao18.practice223.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import exercises.secao18.practice223.model.entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		String path = "/Users/junior/Desktop/Arquivos Java/teste.csv";

		ArrayList<People> peoples = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] lineSplit = line.split(";");
				peoples.add(new People(lineSplit[0], Double.parseDouble(lineSplit[1])));
				line = br.readLine();
			}

			 Collections.sort(peoples);

			for (People l : peoples) {
				System.out.println(l);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	

	
}
