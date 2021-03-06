package exercises.secao18.practice223.model.entities;

import java.text.DecimalFormat;

public class People implements Comparable<People>  {

	private static DecimalFormat df = new DecimalFormat("0.00");

	private String name;

	private Double salary;

	public People() {

	}

	public People(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ", " + df.format(salary);
	}

	@Override
	public int compareTo(People other) {

		return this.salary.compareTo(other.getSalary());
	}

}
