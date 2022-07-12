package exercises.secao19.practice236.model.entities;

import java.util.Objects;

public class Student {
	
	private Integer code;
	
	public Student() {
		
	}

	public Student(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public String toString() {
		return "Student [code=" + code + "]";
	}
	
	
	
	
	
}

