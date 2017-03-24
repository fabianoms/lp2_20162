package iterators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<Integer> ll = new LinkedList<Integer>();
		
		al.add("Daniel");
		al.add("Fabiano");
		al.add("Manoel");
		al.add("Carlos");
		al.add("José");
		ll.add(1);
		ll.add(11);
		ll.add(21);
		ll.add(34);
		ll.add(45);
		
		ListIterator<Integer> iterator = ll.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}

}
