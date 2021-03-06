package exercises.secao20.practice245.application;

import java.util.function.Consumer;

import exercises.secao20.practice245.model.entities.Product;

public class MyConsumer implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
