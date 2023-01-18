import java.util.Scanner;

public class SecondShotQueue extends firstShotQueue {
	static FullyVaccinated FullyVaccinated1 = new FullyVaccinated();

	public SecondShotQueue() {
		this("SecondShotQueue");
	}
	// =======================================

	public SecondShotQueue(String name) {
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

	public void displaysecndShot() {
		int j = 1;
		System.out.println("Pateint Queue: ");
		while (!SecndQueue.isEmpty()) {
			String b = SecndQueue.dequeueData();
			System.out.println("Pateint [" + j + "]: " + b);
			j++;
		}
	}

	public void CheckifPatientIsInTurn() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name to get the second shot: ");
		String name = scan.next();

		if (name.equals(SecndQueue.first.data)) {
//			String a = SecndQueue.dequeueData();
			Node temp = new Node(name);

			if (isEmpty())

			{
				first = temp;
				first = first.nextNode;
			}

			System.out.println("Pateint has been fully vaccinated " );
			FullyVaccinated1.enqueue(SecndQueue.dequeueData());

		} else {
			System.out.println("please wait your turn");
			CheckifPatientIsInTurn();
		}

	}

}
