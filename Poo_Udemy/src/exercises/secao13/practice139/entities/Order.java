package exercises.secao13.practice139.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private static DecimalFormat df = new DecimalFormat("0.00");
	
	private Date moment;

	private OrderStatus status;

	private ArrayList<OrderItem> items = new ArrayList<>();

	private Client client;

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ArrayList<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Double total() {
		// TODO
		Double total = 0.0;
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(this.moment));
		sb.append("\nOrder status: " + this.status );
		sb.append("\nClient: "+ this.client);
		sb.append("\nOrder items:");
		for(OrderItem item : items) {
			sb.append("\n"+item);
		}
		sb.append("\nTotal price: $"+df.format(this.total()));

		return sb.toString();
	}

}
