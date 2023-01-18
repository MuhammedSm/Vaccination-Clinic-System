import java.util.*;

public class FrontDesk {

	public static void main() {
		pateintPriortyQueue q = new pateintPriortyQueue();
		firstShotQueue q2 = new firstShotQueue();
		SecondShotQueue q3 = new SecondShotQueue();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("How many people would like to register(insert) for vaccination?");
		int a = scan.nextInt();
		int count = 1;
		int count2 = 1;
		while (count <= a) {
			System.out.println("Enter the name of  pateint [" + count + "]:");
			String name = scan.next();
			System.out.println("Enter his/her age:");
			int age = scan.nextInt();
			person pateint = new person(name, count, age);
			q.enqueue(pateint.getName(), pateint.getAge());
			System.out.println("Pateint " + count + " was added to the Queue");
			count++;

		}

		System.out.println("Would you like to open the Control Panel?");
		String answer = scan.next();
		if (answer.equals("yes")) {
			System.out.println("---------------Vaccination Clinic---------------");
			System.out.println("| \t \t Control Panel\t\t\t|");
			System.out.println("------------------------------------------------");
			System.out.println("#Please enter the number to pick an opperation: ");
			System.out.println("(1)Display and transfer the pateints to the vaccination room. ");
			System.out.println("(2)Delete pateint.");
			System.out.println("(3)Enter a name to take the first shot. ");
			System.out.println("(4)Display vaccination room ");
			System.out.println("(5)Enter a name to take the second shot. ");
			System.out.println("(6)Display vaccination room 2 ");
			System.out.println("(7)Print pateint information ");
			System.out.println("________________________________________________");
			int x = scan.nextInt();
			switch (x) {
			case 1:
				q.transfer();
				break;
			case 2:
				String z = q.dequeueData();
				System.out.println("patient " + z + " has been removed ");
				System.out.println("after removing first patient");
				q.display();
				break;
			case 3:
				int count3 = 1;
				q.transfer();
				while (count2 <= a) {
					q2.CheckifPatientIsInTurn();

					while (count2 == a && count3 <= a) {
						q3.CheckifPatientIsInTurn();
						count3++;
					}
					count2++;
				}
				q
				break;
			case 4:
				q.display();
				q2.display2();
				break;
			case 5:
				q2.display2();
				q3.CheckifPatientIsInTurn();
				break;
			case 6:
				q.display();
				q2.display2();
				
				break;

			}

		} else {
			System.out.print("Clinic system closed");
		}
	}

	public static void main(String[] args) {
		main();
	}

}
