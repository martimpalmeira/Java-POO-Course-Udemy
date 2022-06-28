package exercises.secao13.practice138.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import exercises.secao13.practice138.entities.Comment;
import exercises.secao13.practice138.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String title1 = "Traveling to New Zealand";
		Integer likes1 = 12;
		Date moment1 = sdf1.parse("21/06/2018 13:05:44");
		String content1 = "I'm going to visit this wonderful country!";
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Post post1 = new Post(moment1, title1, content1, likes1);
		post1.addComment(c1);
		post1.addComment(c2);
		System.out.println(post1);
		
		String title2 = "Good night guys";
		Integer likes2 = 5;
		Date moment2 = sdf1.parse("28/07/2018 23:14:19");
		String content2 = "See you tomorrow";
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		Post post2 = new Post(moment2, title2, content2, likes2);
		post2.addComment(c3);
		post2.addComment(c4);
		System.out.println(post2);
		
	}
}
