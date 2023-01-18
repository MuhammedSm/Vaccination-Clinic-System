import java.util.*;

public class firstShotQueue extends pateintPriortyQueue {
	static SecondShotQueue SecndQueue = new SecondShotQueue();

	public firstShotQueue() {
		this("firstShotQueue");
	}
	// =======================================

	public firstShotQueue(String name) {
		super(name);
		first = null;
	}

	public boolean isEmpty() {
		boolean empty = super.isEmpty();
		return empty;
	}

	public void enqueue(String obj) {
		insertAtBack(obj);

	}

	public String dequeueData() {

		return removeFromFrontData();
	}

	public int dequeuePr() {

		return removeFromFrontPr();
	}

	public void display2() {
		int j = 1;
		System.out.println("Patient Queue: ");
		while (!frstQueue.isEmpty()) {
			String b = frstQueue.dequeueData();
			System.out.println("Pateint [" + j + "]: " + b);
			j++;
		}
	}

	public void CheckifPatientIsInTurn() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int i = 1;
		System.out.println("Enter your name to get the first shot: ");
		String name = scan.next();

		if (name.equals(frstQueue.first.data)) {
			String a = frstQueue.dequeueData();
			Node temp = new Node(name);

			if (isEmpty())

			{
				first = temp;
				first = first.nextNode;
			}

			System.out.println("Pateint took his first shot [" + i + "]: " + a);
			SecndQueue.enqueue(a);
			i++;
		} else {
			System.out.println("please wait your turn");
			CheckifPatientIsInTurn();
		}

	}

}
