
public abstract class Item {
	private String idenNum;
	private String title;
	private int copies = 0;
	
	//default constructor
	public Item() {
		idenNum = "";
		title = "";
		copies = 0;
	}
	
	//alternate constructor
	public Item(String idenNum, String title, int copies) {
		this.idenNum = idenNum;
		this.title = title;
		this.copies = copies;
	}
	
	public String getIdenNum() {
		return idenNum;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setIdenNum(String idenNum) {
		this.idenNum = idenNum;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	@Override
	public String toString() {
		return "TITLE = " + title + "\n" +
				"ID = " + idenNum + "\n" +
				"COPIES = " + copies;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Item) {
			Item otherItem = (Item) obj;
			return idenNum.equals(otherItem.idenNum);
		} else {
			return false;
		}
	}
	
	public int checkIn(Object item) {
		System.out.println("A " + item + " was checked-in, so the number of copies available changed."
				+ " The new amount for" + getTitle() + "is:");
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
