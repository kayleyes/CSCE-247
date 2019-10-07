package csce247.assignments.singelton;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class songQueue <T> implements Iterable <T> {
	//node in the queue
	class Node
	{
		T item;
		Node next;
	}

	private String name; //name of instance
	private Node head; //front of the queue
	private Node tail; //end of the queue
	private static int numItems; //number of items in queue  


	public songQueue(String name) {
		this.name = name;
		this.head = null;
		this.tail = null;      
		this.numItems = 0;
	}

	public boolean isEmpty()
	{
		return (size() == 0);
	}

	public static void enqueue()
	{
		Node n = new Node();
		T item = null;
		n.item = item;
		n.next = null;
		if(isEmpty())
		{  
			head = n;
			tail = n;
		}
		else
		{
			tail.next = n;
			tail = n;
		}
		numItems++;
	}

	public Node dequeue()
	{
		Node n = null;
		if (isEmpty())
			throw new NoSuchElementException();
		else
		{
			n = head;
			head = head.next;
		}
		numItems--;
		return n;      
	}

	public Node peek()
	{
		if(isEmpty())
			return null;
		else
			return head;
	}

	public static int size()
	{
		return numItems;
	}  

	@Override
	public String toString() {
		return "Queue [" + (name != null ? "name=" + name + ", " : "") + (head != null ? "head=" + head + ", " : "")
				+ (tail != null ? "tail=" + tail + ", " : "") + "numItems=" + numItems + "]";
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}  
}
