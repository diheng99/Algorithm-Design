package dijkstraAlgoMinheap;

public class LinkedList {

	Node head;
	
	public class Node {
		Edge edge;
		Node next;
		
		Node(Edge edge)
		{
			this.edge = edge;
		}
	}
	
	public void insert(Edge edge)
	{
		Node new_node = new Node(edge);

		if(this.head == null)
		{
			this.head = new_node;
		}
		else
		{
			Node cur = this.head;
			while(cur.next != null)
				cur = cur.next;
			cur.next = new_node;
		}
	}
}