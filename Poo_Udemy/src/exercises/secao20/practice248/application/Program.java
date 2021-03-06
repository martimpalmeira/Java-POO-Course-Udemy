package exercises.secao20.practice248.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

		// Stream<Integer> stream = list.stream();

		// System.out.println(Arrays.toString(stream.toArray()));

		// Stream<String> st = Stream.of("a","b","c");

		// System.out.println(Arrays.toString(st.toArray()));

		// Stream<Integer> str3 = Stream.iterate(0, p -> p + 2);
		// System.out.println(Arrays.toString(str3.limit(10).toArray()));

		Stream<Integer> str = Stream.iterate(new Integer[] { 0, 1 }, p -> new Integer[] { p[1], p[0] + p[1] })
				.map(p -> p[0]);
		
		System.out.println(Arrays.toString(str.limit(10).toArray()));

	}

}
