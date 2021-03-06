package exercises.secao19.practice236.application;

import java.util.Scanner;

import exercises.secao19.practice236.model.entities.Course;
import exercises.secao19.practice236.model.entities.Instructor;
import exercises.secao19.practice236.model.entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Instructor inst = new Instructor();
		inst.addCourse(new Course("A"));
		inst.addCourse(new Course("B"));
		inst.addCourse(new Course("C"));
		
		for(Course c : inst.getCourses()) {
			System.out.print("How many students for course " + c.getName() + "? ");
			int numUsers = sc.nextInt();
			for(int i =0; i< numUsers; i++) {
				Student s = new Student(sc.nextInt());
				c.addStudent(s);
				inst.addStudent(s);
				
			}
		}
		
		System.out.print("Total students: " + inst.getStudents().size());
			
		sc.close();
	}

}
