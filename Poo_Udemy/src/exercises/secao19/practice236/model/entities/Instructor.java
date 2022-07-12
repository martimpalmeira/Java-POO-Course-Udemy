package exercises.secao19.practice236.model.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
	
	private Set<Course> courses = new HashSet<>();
	
	private Set<Student> students = new HashSet<>();
	
	public void addCourse(Course c) {
		if(c!= null) {
			courses.add(c);
		}
	}
	
	public void removeCourse(Course c) {
		if(courses.contains(c)) {
			courses.remove(c);
		}
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student c) {
		if(c!= null) {
			students.add(c);
		}
	}
	
	public void removeStudent(Student s) {
		if(students.contains(s)) {
			students.remove(s);
		}
	}
	
	
	
	
}
