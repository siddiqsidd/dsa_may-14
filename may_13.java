package assignment_dsa;
/*
 * 	"Segregate even and odd nodes 

https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1/?page=2&difficulty[]=0&category[]=Linked%20List&sortBy=submissions


Detect loop in a linked list
https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1/?page=1&difficulty[]=-1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions"
 */
public class may_13 {
	
	//1.segregate even and odd nodes
		Node head; 
		class Node
		{
			int data;
			Node next;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}

		void segregateEvenOdd()
		{
			Node end = head;
			Node prev = null;
			Node curr = head;

			while (end.next != null)
				end = end.next;

			Node new_end = end;
			while (curr.data %2 !=0 && curr != end)
			{
				new_end.next = curr;
				curr = curr.next;
				new_end.next.next = null;
				new_end = new_end.next;
			}
			if (curr.data %2 ==0)
			{
				head = curr;
				while (curr != end)
				{
					if (curr.data % 2 == 0)
					{
						prev = curr;
						curr = curr.next;
					}
					else
					{
						prev.next = curr.next;
						curr.next = null;
						new_end.next = curr;
						new_end = curr;

						curr = prev.next;
					}
				}
			}

			else prev = curr;

			if (new_end != end && end.data %2 != 0)
			{
				prev.next = end.next;
				end.next = null;
				new_end.next = end;
			}
		}
		void push(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
		void printList()
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
		public static void main(String args[])
		{
			may_13 llist = new may_13();
			llist.push(11);
			llist.push(10);
			llist.push(9);
			llist.push(6);
			llist.push(4);
			llist.push(2);
			llist.push(0);
			System.out.println("Original Linked List");
			llist.printList();

			llist.segregateEvenOdd();

			System.out.println("Modified Linked List");
			llist.printList();
		}
	
		//2.detect loop in a linked list
		
		/*
		 * // Java program to detect loop in a linked list
import java.util.*;

public class LinkedList {

	static Node head; // head of list

	/* Linked list Node
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	static public void push(int new_data)
	{
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	static boolean detectLoop(Node h)
	{
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			if (s.contains(h))
				return true;

			s.add(h);

			h = h.next;
		}

		return false;
	}

	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		llist.head.next.next.next.next = llist.head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
	}
}


		 */

}
