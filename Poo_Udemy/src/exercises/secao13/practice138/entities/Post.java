package exercises.secao13.practice138.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;

	private String title;

	private String content;

	private Integer likes;

	private ArrayList<Comment> comments = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment c) {
		this.comments.add(c);
	}

	public void removeComment(Comment c) {
		this.comments.remove(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes + " Likes - " + sdf1.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments:\n");
		for (Comment c : this.comments) {
			sb.append(c.getText()+"\n");
		}
		return sb.toString();
	}

}
