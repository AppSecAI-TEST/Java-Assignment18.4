/**
 * 
 * @author lenovo
 * here we are creating a program 
 * which Impliment the Queue as a LinkedList
 *
 */
public class LinkedListAsQueue {
	
	//here we are declaring number of items
    private Node front, rear;
	private int currentSize; 

	//here we are creating a  class to define the linked node
	private class Node {
		String data;
		Node next;
	}

	//here we are declaring the  Zero argument constructor
	public LinkedListAsQueue() {
		front = null;
		rear = null;
		currentSize = 0;
	}
//
	public boolean isEmpty() {
		return (currentSize == 0);
	}

	//here we are Removing the item from the beginning of the list.
	public String dequeue() {
		String data = front.data;
		front = front.next;
		if (isEmpty()) {
			rear = null;
		}
		currentSize--;
		System.out.println(data + " removed from the queue");
		return data;
	}

	//Here we are Adding the data to the end of the list.
	public void enqueue(String string) {
		Node oldRear = rear;
		rear = new Node();
		rear.data = string;
		rear.next = null;
		if (isEmpty()) {
			front = rear;
		} else {
			oldRear.next = rear;
		}
		currentSize++;
		System.out.println(string + " added to the queue");

	}
     //here we are creating a method currentsize()
	//which is of return type
	public int currentsize() {
		return currentSize;
	}
	//here we are creating the main method
     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 //here we are creating the object of the linked list
		LinkedListAsQueue queue = new LinkedListAsQueue();
		//here we are inserting the element 
		queue.enqueue("item1");
		queue.enqueue("item2");
		queue.enqueue("item3");
		queue.enqueue("item4");
		queue.enqueue("item5");

		System.out.println("Delete an item from queue: " + queue.dequeue());//print staement
		System.out.println("Size of the queue: " + queue.currentSize);//print staement

	}

}
