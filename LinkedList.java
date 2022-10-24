package CircularSinglyLinkedList;

public class LinkedList<T> {

  private Node<T> first;
  private Node<T> last;
  private int size;
	
  private class Node<T>{
	  //field
	  private T item;
	  private Node<T> next;
	  
	  //creating node
	  public Node(T val) {
		item = val;
	}
  }
  
  public void addFirst(T item)
  {
	  Node<T> node = new Node(item);
	  
	  if(isEmpty())
	  {
		  first = last = node;
	  }else {
		  node.next = first;
		  first = node;
		  last.next = first;
	  }
	  
	  size++;
  }
  
  public void addLast(T item)
  {
		Node<T> node = new Node(item);

		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
			last.next = first;
		}
		
		size++;
  }
  
  public T removeFirst()
  {
	  T item = null;
	  
	  if(first == last)
	  {
		  item = first.item;
		  first = last =  null;
		  size = 0;
	  }else {
		  item = first.item;
		  first = first.next;
		  last.next = first;
		  size--;
	  }
	  
	  return item;
  }
  
  
  public T removeLast()
  {
	  T item = null;
	  
	  if(first == last)
	  {
		  item = first.item;
		  first = last =  null;
		  size = 0;
	  }else {
		 var prev = getPrevious();
		 item = prev.next.item;
		 prev.next = first;
		 last = prev;
	  }
	  
	  return item;
  }
  
  
  //get previous node of last 
  private Node<T> getPrevious()
  {
	  var current = first;
	  do {
		  current = current.next; 
	  }while(current.next != last);
		  
	  return current;  
  }
  
  public void Traverse()
  {
	  // list size only 1
	  if(sizeOf() == 1)
	  {
		  System.out.print(first.item);
		  return;
	  }
	  
	  //list size more then 1
	  var current = first;
	  
	  do {
		System.out.print(current.item+" ");
		current = current.next;
	} while (current != first);
  }
  
  //checking list empty or not method
  private boolean isEmpty()
  {
	  if(first == null && last == null)
	  {
		  return true;
	  }
	  
	  return false;
  }
  
  //return list size
  public int sizeOf()
  {
	  return size;
  }

}
