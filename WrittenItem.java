
public abstract class WrittenItem extends Item {
	private String author;
	
	public WrittenItem() {
		super();
		author = "";
	}
	
	public WrittenItem(String idenNum, String title, int copies, String author) {
		super(idenNum, title, copies);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return super.toString() +
				"\nAUTHOR = " + author;
	}
}
