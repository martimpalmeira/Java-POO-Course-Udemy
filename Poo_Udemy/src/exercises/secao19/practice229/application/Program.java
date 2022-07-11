package exercises.secao19.practice229.application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Object> lista = new ArrayList<>();
		lista.add(4);
		lista.add("oi");
		printList(lista);
		
	}
	
	public static void printList(List<?> list) {
		for(Object i : list) {
			System.out.println(i);
		}
	}

}
