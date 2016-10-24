
public class JournalPaper extends WrittenItem {
	private String yearPublished;
	
	public JournalPaper() {
		super();
		yearPublished = "";
	}
	
	public String yearPublished() {
		return yearPublished;
	}
	
	public void yearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public String toString() {
		return super.toString() +
				"\nYEAR PUBLISHED = " + yearPublished;
	}
}
