import java.util.*;

public class pateintPriortyQueue extends Linkedlist {
	static firstShotQueue frstQueue = new firstShotQueue();

	// ======================================
	public pateintPriortyQueue() {
		this("pateintPriortyQueue");
	}
	// =======================================

	public pateintPriortyQueue(String name) {
		super(name);
		first = null;
	}

	public boolean isEmpty() {
		boolean empty = super.isEmpty();
		return empty;
	}

	public void enqueue(String obj, int pr) {

		Node start = first;

		Node temp = new Node(obj, pr);

		if (isEmpty())

		{
			first = temp;
			return;
		}
		if (first.priority < pr) {

			temp.nextNode = first;
			first = temp;
		} else {

			while (start.nextNode != null && start.nextNode.priority > pr) {
				start = start.nextNode;
			}

			temp.nextNode = start.nextNode;
			start.nextNode = temp;
		}
	}

	public String dequeueData() {

		return removeFromFrontData();
	}

	public int dequeuePr() {

		return removeFromFrontPr();
	}

	public void display() {
		int i = 1;
		System.out.println("The queue after priortizing it:");
		while (!isEmpty()) {
//			print();
			String a = dequeueData();
			System.out.println(" pateint [" + i + "]: " + a);

			frstQueue.enqueue(a);
			i++;
		}
	}

	public void transfer() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("would u like to transfer the patients to the vaccination room?");
		String answer = scan.next();
		if (answer.equals("yes")) {
			int i = 1;
			System.out.println("The following pateints have been transfered to the vaccination room :");

			while (!isEmpty()) {
//				print();
				String a = dequeueData();
				System.out.println("patient [" + i + "]: " + a);
				frstQueue.enqueue(a);
				i++;

			}

		} else {
			System.out.println("No patients will be vaccinated ");
		}

	}

}