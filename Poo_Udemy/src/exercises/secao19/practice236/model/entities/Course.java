package exercises.secao19.practice236.model.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	
	private String name;

	private Set<Student> students = new HashSet<>();
	
	public Course() {
		
	}
	
	public Course(String name) {
		this.name = name;
	}

	public void addStudent(Student student) {
		if (student != null) {
			students.add(student);
		}
	}
	
	public void removeStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
	
}
