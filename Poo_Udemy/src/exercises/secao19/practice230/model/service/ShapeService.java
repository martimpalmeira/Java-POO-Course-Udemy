package exercises.secao19.practice230.model.service;

import java.util.List;

import exercises.secao19.practice230.model.entities.Shape;

public class ShapeService {
	

	public static double areasSum(List<? extends Shape> shapes) {
		
	
		double sum = 0;
		for (Shape s : shapes) {
			sum += s.area();
		}
		return sum;
	}
}
