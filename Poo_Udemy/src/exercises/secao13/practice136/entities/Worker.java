package exercises.secao13.practice136.entities;

import java.util.ArrayList;
import java.util.Calendar;

public class Worker {

	private String name;

	private WorkerLevel level;

	private Double baseSalary;

	private Department department;

	private ArrayList<HourContract> contracts = new ArrayList<HourContract>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ArrayList<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public Double income(Integer year, Integer month) {		
		Double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract contract : this.contracts) {
			cal.setTime(contract.getDate());
			int calYear = cal.get(Calendar.YEAR);
			System.out.println(calYear);
			Integer calMonth = 1 + cal.get(Calendar.MONTH);
			System.out.println(calMonth);
			if(calYear  == year && calMonth == month ) {
				sum+=contract.totalValue();
			}	
		}
		return sum;
	}
	
	
	
	
	
}
