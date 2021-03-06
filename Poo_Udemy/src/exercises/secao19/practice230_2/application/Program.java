package exercises.secao19.practice230_2.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();

		copy(myInts, myObjs);
		System.out.println(myObjs);

		copy(myDoubles, myObjs);
		System.out.println(myObjs);

		
	}

	public static void copy(List<? extends Number> list1, List<? super Number> list2) {
		for (Number i : list1) {
			list2.add(i);
		}
	}

	public static void printList(List<?> list) {
		for (Object i : list) {
			System.out.println(i);
		}
	}

}
