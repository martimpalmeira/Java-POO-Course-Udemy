package exercises.secao19.practice238.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> voteRegisters = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		// /Users/junior/Desktop/Arquivos Java/votesregistration.csv
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] lineSplit = line.split(";");
				String name = lineSplit[0];
				Integer numberOfVotes = Integer.parseInt(lineSplit[1]);

				if (voteRegisters.containsKey(name)) {
					numberOfVotes += voteRegisters.get(name);
					voteRegisters.put(name, numberOfVotes);		
				} else {
					voteRegisters.put(name, numberOfVotes);	
				}
				
				line = br.readLine();

			}

			printMap(voteRegisters);

		} catch (IOException e) {
			System.out.print(e.getMessage());
		}

		sc.close();
	}

	public static void printMap(Map<?, ?> map) {
		Set<?> set = map.keySet();
		for (Object obj : set) {
			System.out.println(obj + ": " + map.get(obj));
		}
	}

}
