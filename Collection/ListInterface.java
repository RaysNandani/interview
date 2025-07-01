package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);

		System.out.println(list.get(2));
		System.out.println(list);
		list.add(2, 222);
		
		System.out.println(list);
		System.out.println(list.indexOf(222));
		System.out.println(list);
		System.out.println(list.subList(2, 4));
		System.out.println(list);
		list.set(3, 55);
		System.out.println(list);
		System.out.println("=====================================");

		LinkedList<Integer> l = new LinkedList<Integer>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		System.out.println(l.element());
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l);
		System.out.println(l.getLast());
		System.out.println(l);
		System.out.println(l.peek() + "pekkkk");
		System.out.println(l);
		System.out.println(l.peekFirst());
		System.out.println(l);
		System.out.println(l.peekLast());
		System.out.println(l);
		System.out.println(l.offerFirst(120));
		System.out.println(l);
		System.out.println(l.offerLast(150));
		System.out.println(l);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

		Stack<Integer> s = new Stack<Integer>();

		s.push(110);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(7);

		System.out.println(s.empty());
		System.out.println(s);
		System.out.println(s.peek() + "guggg");
		System.out.println(s);
		System.out.println(s.search(4) + "search");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s + "endddddddddd");
		System.out.println(s);
		System.out.println("=========+++++++++++++++++++++=====================");

		Vector<Integer> v = new Vector<Integer>();
		v.add(50);
		v.add(100);
		v.add(150);
		// v.add(200);

		System.out.println(v.elementAt(2));
		System.out.println(v);
		v.insertElementAt(75, 1);
		System.out.println(v);
		System.out.println(v.subList(1, 3));
		System.out.println(v);
		System.out.println(v.hashCode());
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v);
	}

}