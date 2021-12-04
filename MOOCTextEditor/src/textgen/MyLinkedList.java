package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next=tail;
		tail.prev=head;
		size=0;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		if(element==null) {
			throw new NullPointerException("Error");
		}
		LLNode<E> newnode = new LLNode<E>(element);
		newnode.next = tail;
		newnode.prev = tail.prev;
		tail.prev.next = newnode;
		tail.prev = newnode;
		this.size++;
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		// TODO: Implement this method.
		if(index<0 || index>size-1 || size==0) {
			throw new IndexOutOfBoundsException("Error");
		}
		LLNode<E> temp=head.next;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		if(element==null) {
			throw new NullPointerException("Error");
		}
		else if(index<0 || index > size) {
			throw new IndexOutOfBoundsException("Error");
		}
		LLNode<E> newnode = new LLNode<E>(element);
		LLNode<E> temp = head;
		int i=0;
		for(;i<index;i++) {
			temp = temp.next;
		}
		newnode.prev = temp;
		newnode.next = temp.next;
		newnode.next.prev = newnode;
		temp.next = newnode;
		this.size++;
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		if(index<0 || index > size-1) {
			throw new IndexOutOfBoundsException("Error");
		}
		LLNode<E> temp=head;
		LLNode<E> nextnode = null;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		nextnode = temp.next;
		temp.next = nextnode.next;
		nextnode.next.prev = temp;
		E data = nextnode.data;
		nextnode.next = null;
		nextnode.prev = null;
		size--;
		return data;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if(element==null) {
			throw new NullPointerException("Error");
		}
		if(index<0 || index > size-1) {
			throw new IndexOutOfBoundsException("Error");
		}
		LLNode<E> temp=head.next;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		E n = temp.data;
		temp.data = element;
		return n;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
