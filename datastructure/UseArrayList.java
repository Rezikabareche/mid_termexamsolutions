package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(5);
		numList.add(7);
		numList.add(9);
		//print the ArrayList
		System.out.println("Initial ArrayList:");
		System.out.println(numList);

		//use add method with index=0 to add elements to the beginning of the list
		numList.add(0, 3);
		numList.add(0, 1);

		System.out.println("ArrayList after adding elements at the beginning:");
		//print ArrayList
		System.out.println(numList);

		//remove element at index 2
		numList.remove(2);
		//print the list
		System.out.println("\nArrayList after removing element at index 2:" + numList);

		//call get () method to retrieve value at index 2
		System.out.println("Entry at index 2 before call to set: " + numList.get(2));
		//call indexOf() and lastIndexOf() methods to check the indices of specified elements
		System.out.println("indexOf(1) : " + numList.indexOf(1));
		System.out.println("lastIndexOf(1) : " + numList.lastIndexOf(1));

		//use iterator() method to traverse through the list
		System.out.println("List contents using Iterator () method:");
		Iterator it = numList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}

	}
}