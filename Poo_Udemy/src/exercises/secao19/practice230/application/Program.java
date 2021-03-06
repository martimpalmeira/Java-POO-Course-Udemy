package exercises.secao19.practice230.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import exercises.secao19.practice230.model.entities.Circle;
import exercises.secao19.practice230.model.entities.Rectangle;
import exercises.secao19.practice230.model.entities.Shape;
import exercises.secao19.practice230.model.service.ShapeService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		DecimalFormat df = new DecimalFormat("0.00");

		List<Shape> shapes = new ArrayList<>();

		List<Circle> circles = new ArrayList<>();

		circles.add(new Circle(2.0));
		
		

		List<Rectangle> rectangles = new ArrayList<>();

		rectangles.add(new Rectangle(3.0, 2.0));
		
		System.out.println(df.format(ShapeService.areasSum(rectangles)));

		System.out.println(df.format(ShapeService.areasSum(circles)));

		shapes.add(new Circle(2.0));

		shapes.add(new Rectangle(3.0, 2.0));

		System.out.print("Total area: ");
		System.out.println(df.format(ShapeService.areasSum(shapes)));
		
		List<? extends Number> list = new ArrayList<>();
		
		Number x = 3;
		
		
		Number y =  list.get(0);

	}

}
