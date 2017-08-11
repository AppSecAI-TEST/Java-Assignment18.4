import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/*
 * here we are creating a application for linked list
 * and performing some operation
 */
//here we creating class
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are Linked List
		LinkedList<String> linkedlist = new LinkedList<String>();

		//here we are adding the element in the Linked list
		//by the help of add()..
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item4");
		// The method descendingIterator() returns an Iterator object with
		// reverse order.
		Iterator<String> itr = linkedlist.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
        //here we are creating a arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.add("item5");
        
		linkedlist.addAll(list);
		for (Object arr1 : linkedlist) {
			System.out.println(arr1);
		}

	}
}
