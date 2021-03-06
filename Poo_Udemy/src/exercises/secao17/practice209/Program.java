package exercises.secao17.practice209;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isFile);
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		boolean success = new File(strPath + "/subdir.html").mkdir();
		
		System.out.println("Página criada com sucesso "+ success);
		
		sc.close();
		
	}

}
