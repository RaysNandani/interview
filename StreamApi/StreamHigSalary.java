package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHigSalary {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(1000);
		list.add(8000);
		list.add(4000);
		list.add(6000);

		/*
		 * System.out.println("first highest");
		 * list.stream().distinct().sorted(Collections.reverseOrder()).findFirst().
		 * ifPresent(e -> System.out.println(e));
		 */
		System.out.println("second highest");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

	}

}

