public class FullyVaccinated extends SecondShotQueue {
	static FullyVaccinated FullyVaccinated1 = new FullyVaccinated();

	public FullyVaccinated() {
		this("FullyVaccinated");
	}
	// =======================================

	public FullyVaccinated(String name) {
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
		while (!FullyVaccinated1.isEmpty()) {
			String b = FullyVaccinated1.dequeueData();
			System.out.println("Pateint [" + j + "]: " + b);
			j++;
		}
	}

}
