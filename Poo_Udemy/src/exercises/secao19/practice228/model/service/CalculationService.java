package exercises.secao19.practice228.model.service;

import java.util.ArrayList;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(ArrayList<T> list) {
		T maxP = list.get(0);
		for (T p : list) {
			if (maxP.compareTo(p) < 0) {
				maxP = p;
			}
		}return maxP;
	}
}
