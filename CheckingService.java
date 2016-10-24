
public abstract class CheckingService {
	private int copies;

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int checkIn(Object item) {
		System.out.println("A " + item + " was checked-in, so the number of copies available changed."
				+ " The new amount for" +  + "is:");
		return ++copies;
	}
	
	public int checkOut(Object item) {
		System.out.println("A " + item + " was checked-out, so the number of copies available changed."
				+ " The new amount for" + getTitle() + "is:");
		return --copies;
	}
	
	public int addItem(Object item) {
		System.out.println("A " + item + " was added, so the number of copies available changed."
				+ " The new amount for" + getTitle() + "is:");
		return ++copies;
	}
}
