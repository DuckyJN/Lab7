
public class Video extends MediaItem{
	private String director;
	private int yearReleased;
	
	public Video() {
		super();
		director = "";
		yearReleased = 0;
	}
	
	public Video(String idenNum, String title, int copies, int runtime, String genre, 
			String director, int yearReleased) {
		super(idenNum, title, copies, runtime, genre);
		this.director = director;
		this.yearReleased = yearReleased;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getYearReleased() {
		return yearReleased;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	public String toString() {
		return super.toString() +
				"\nDIRECTOR = " + director + "\n" +
				"YEAR RELEASED = " + yearReleased;
	}
}
