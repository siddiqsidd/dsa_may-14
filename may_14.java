package assignment_dsa;
/*
 * 	"""1. Add 1 to  number represented by Linked List
https://www.geeksforgeeks.org/add-1-number-represented-linked-list/

2. Add two linked lists
https://www.geeksforgeeks.org/add-two-numbers-represented-by-linked-lists/

3. Pairwise swap
https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1/?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions"""
 */
public class may_14 {

	//1. Add 1 to  number represented by Linked List
		static class Node {
			int data;
			Node next;
		}

		static Node newNode(int data)
		{
			Node new_node = new Node();
			new_node.data = data;
			new_node.next = null;
			return new_node;
		}

		static Node reverse(Node head)
		{
			Node prev = null;
			Node current = head;
			Node next = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			return prev;
		}

		static Node addOneUtil(Node head)
		{
			Node res = head;
			Node temp = null, prev = null;

			int carry = 1, sum;

			while (head != null) 
			{
				sum = carry + head.data;

				carry = (sum >= 10) ? 1 : 0;

				sum = sum % 10;

				head.data = sum;

				temp = head;
				head = head.next;
			}

			if (carry > 0)
				temp.next = newNode(carry);

			return res;
		}
public 	static Node addOne(Node head)
		{
			head = reverse(head);

			head = addOneUtil(head);

			return reverse(head);
		}

		static void printList(Node node)
		{
			while (node != null) {
				System.out.print(node.data);
				node = node.next;
			}
			System.out.println();
		}

		public static void main(String[] args)
		{
			Node head = newNode(1);
			head.next = newNode(9);
			head.next.next = newNode(9);
			head.next.next.next = newNode(9);

			System.out.print("List is ");
			printList(head);

			head = addOne(head);
			System.out.println();
			System.out.print("Resultant list is ");
			printList(head);
		
	}


		
		//2. Add two linked lists
		
		/*

class LinkedList {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void addTwoLists(Node first, Node second) {
		Node start1 = new Node(0);
		start1.next = first;
		Node start2 = new Node(0);
		start2.next = second;

		addPrecedingZeros(start1, start2);
		Node result = new Node(0);
		if (sumTwoNodes(start1.next, start2.next, result) == 1) {
			Node node = new Node(1);
			node.next = result.next;
			result.next = node;
		}
		printList(result.next);
	}

	private int sumTwoNodes(Node first, Node second, Node result) {
		if (first == null) {
			return 0;
		}
		int number = first.data + second.data + sumTwoNodes(first.next, second.next, result);
		Node node = new Node(number % 10);
		node.next = result.next;
		result.next = node;
		return number / 10;
	}

	private void addPrecedingZeros(Node start1, Node start2) {
		Node next1 = start1.next;
		Node next2 = start2.next;
		while (next1 != null && next2 != null) {
			next1 = next1.next;
			next2 = next2.next;
		}
		if (next1 == null && next2 != null) {
			while (next2 != null) {
				Node node = new Node(0);
				node.next = start1.next;
				start1.next = node;
				next2 = next2.next;
			}
		} else if (next2 == null && next1 != null) {
			while (next1 != null) {
				Node node = new Node(0);
				node.next = start2.next;
				start2.next = node;
				next1 = next1.next;
			}
		}
	}

	public	void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.head1 = new Node(7);
		list.head1.next = new Node(5);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(6);
		System.out.print("First List is ");
		list.printList(head1);

		list.head2 = new Node(8);
		list.head2.next = new Node(4);
		System.out.print("Second List is ");
		list.printList(head2);

		System.out.print("Resultant List is ");
		list.addTwoLists(head1, head2);
	}

}

		 */
		
		
		//3.pairwise swap
		
		
		/*

class LinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void pairWiseSwap()
	{
		Node temp = head;
		while (temp != null && temp.next != null) {

			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);

		new_node.next = head;
		head = new_node;
	}
	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();

		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Linked List before calling pairWiseSwap() ");
		llist.printList();

		llist.pairWiseSwap();

		System.out.println("Linked List after calling pairWiseSwap() ");
		llist.printList();
	}
}

		 */
}
