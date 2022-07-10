package exercises.secao19.practice227.model.service;

import java.util.ArrayList;

public class PrintService {

	private static ArrayList<Object> numbers = new ArrayList<>();

	public void addValue(Object value) {
		numbers.add(value);
	}

	public Object first() throws RuntimeException {
		if (numbers.isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		return numbers.get(0);
	}

	public void print() {
		System.out.println(numbers);
	}
}
