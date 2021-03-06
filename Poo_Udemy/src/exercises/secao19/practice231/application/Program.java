package exercises.secao19.practice231.application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> setList = new HashSet<>();

		setList.add("a");
		setList.add("e");
		setList.add("i");
		setList.add("o");
		setList.add("u");
	
		printSet(setList);
	}

	public static <T> void printSet(Set<T> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}

}
