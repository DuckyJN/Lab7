
public abstract class MediaItem extends Item {
	private int runtime;
	private String genre;
	
	public MediaItem() {
		super();
		runtime = 0;
		genre = "";
	}
	
	public MediaItem(String idenNum, String title, int copies, int runtime, String genre) {
		super(idenNum, title, copies);
		this.runtime = runtime;
		this.genre = genre;
	}
	
	public int getRuntime() {
		return runtime;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nRUNTIME = " + runtime + "\n" +
				"GENRE = " + genre;
	}
}
