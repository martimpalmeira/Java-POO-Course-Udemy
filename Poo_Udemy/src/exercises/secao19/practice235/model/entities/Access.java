package exercises.secao19.practice235.model.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Access {
	
private String name;
	
	private LocalDate date;
	
	public Access() {
		
	}

	public Access(String name, LocalDate date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Access [name=" + name + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Access other = (Access) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
