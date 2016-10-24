
public class Book extends WrittenItem {
	private String publisher;
	
	public Book() {
		super();
		publisher = "";
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setAuthor(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString() {
		return super.toString() +
				"\nPUBLISHER = " + publisher;
	}
}
