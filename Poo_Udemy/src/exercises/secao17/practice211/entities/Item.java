package exercises.secao17.practice211.entities;

public class Item {

	private String name;

	private Double value;

	private Integer quantity;
	
	public Item() {
		
	}

	public Item(String name, Double value, Integer quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double total() {
		return this.value*this.quantity;
	}
	
	
}
