package exercises.secao13.practice133.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercises.secao13.practice133.entities.Order;
import exercises.secao13.practice133.entities.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date orderDate = sdf1.parse("22/10/2022");

		Order order = new Order(1, orderDate, OrderStatus.PENDING_PAYMENT);

		Order order2 = new Order(sc.nextInt(), sdf1.parse(sc.next()), OrderStatus.valueOf(sc.next()));

		System.out.println(order + "\n" + order2);

		sc.close();
	}

}
