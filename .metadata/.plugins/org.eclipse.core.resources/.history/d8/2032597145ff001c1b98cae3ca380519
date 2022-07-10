package exercises.secao19.practice227.application;

import java.util.Scanner;

import exercises.secao19.practice227.model.service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
			int num = sc.nextInt();
			ps.addValue(num);
		}
		
		ps.print();
		
		Object i = ps.first();
		
		try {
			System.out.print("First: " + i);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		
		
		sc.close();
	}
}
