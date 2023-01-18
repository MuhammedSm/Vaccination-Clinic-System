
public class Linkedlist {
	public Node first;
	@SuppressWarnings("unused")
	private String name;

	public Linkedlist() {
		this("Linkedlist");
	}

	// =======================================
	public Linkedlist(String listName) {
		name = listName;
		first = null;
	}

	// =======================================
	public boolean isEmpty() {
		return (first == null);
	}

	public void insertAtFront(String a, int pr) {
		Node p = new Node(a, pr);
		p.nextNode = first;
		first = p;
	}

	// ========================================
	public void insertAtBackpr(String a, int pr) {
		Node p = new Node(a, pr);
		if (isEmpty())
			first = p;
		else {
			Node current = first; // Start at head of list
			while (current.nextNode != null) // Find the end of the list
				current = current.nextNode;

			current.nextNode = p;
		}
	}

	public void insertAtBack(String value) {
		Node c = new Node(value);
		if (first == null) {
			first = c;
		} else {
			Node current = first;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = c;
		}
	}

	// ==============================================
	public String removeFromFrontData() {
		if (isEmpty())
			return "";
		String a = first.data;
		first = first.nextNode;
		return a;
	}
	public void print() {
		Node c = new Node();
		c=first;
		if (isEmpty())
			System.out.println("");
		String a = c.data;
		c = c.nextNode;
	    System.out.println(a);
	}

	public int removeFromFrontPr() {
		if (isEmpty())
			return -1;
		int a = first.priority;
		first = first.nextNode;
		return a;
	}

} // end class List
