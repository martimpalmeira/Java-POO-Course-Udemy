package exercises.secao19.practice235.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import exercises.secao19.practice235.model.entities.Access;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

		Set<Access> list = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {

				String[] lineSplit = line.split(" ");
				list.add(new Access(lineSplit[0], LocalDate.from(dtf.parse(lineSplit[1]))));
				line = br.readLine();

			}

			System.out.println("Total users: " + list.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	

}
