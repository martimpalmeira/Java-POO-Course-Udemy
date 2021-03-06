package exercises.secao19.practice227.model.service;

import java.util.ArrayList;

public class PrintService<T> {

	private ArrayList<T> numbers = new ArrayList<>();

	public void addValue(T value) {
		numbers.add(value);
	}

	public T first() throws RuntimeException {
		if (numbers.isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		return numbers.get(0);
	}

	public void print() {
		System.out.println(numbers);
	}
}
