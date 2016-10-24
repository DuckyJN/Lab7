
public class CD extends MediaItem{
	public String artist;
	
	public CD() {
		super();
		artist = "";
	}
	
	public CD(String idenNum, String title, int copies, int runtime, String genre, 
			String artist) {
		super(idenNum, title, copies, runtime, genre);
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String toString() {
		return super.toString() +
				"\nARTIST = " + artist;
	}
}
