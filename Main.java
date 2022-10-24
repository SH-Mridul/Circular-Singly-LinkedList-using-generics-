package CircularSinglyLinkedList;

public class Main {

	public static void main(String[] args) {
	  LinkedList<Integer> list = new LinkedList<Integer>();
	  list.addFirst(10);
	  list.addFirst(5);
	  list.addLast(15);
	  list.addFirst(1);
	  list.addLast(20);
	 
	  //visit data
	  list.Traverse();
	  
	  //removing data from first 
	  list.removeFirst();
	  
	  //removing data from last
	  list.removeLast();
	 
	  System.out.println();
	  list.Traverse();
	}

}
