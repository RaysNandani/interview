package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {

	
	public static void main(String[] args) {

		List<ContestWinner> l = new ArrayList<ContestWinner>();
		l.add(new ContestWinner("okk", "8966012549"));
		l.add(new ContestWinner("notOkk", "124946655"));
		l.add(new ContestWinner("okok", "124965498"));
		
		
		l.add(new ContestWinner("IamOk", "65154488485"));

		l.stream().map(e -> (e.getName() + " " + e.getPhoneNo()))
		.distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
		 Collections.shuffle(c);
		 return c.stream();}))
		.limit(3).forEach(c -> System.out.println(c));

	}

}