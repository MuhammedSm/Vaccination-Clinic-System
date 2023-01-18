
public class Node {
	public String data;
	public int priority;
	public Node nextNode;

	public Node() {
		data = "";
		priority = 0;
	}

	public Node(String object, int pr) {
		data = object;
		priority = pr;
	}

	public Node(String obj) {
		data = obj;
	}

	public void display() {
		System.out.println(data + "  ");
		System.out.println(priority + "  ");
	}
} // end class Node