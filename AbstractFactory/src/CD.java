
public class CD implements Media {
	private String track = "";

	public void writeOnDisk(String newtrack) {
		track = newtrack;
	}

	public String readDisk() {
		return track;
	}
}
