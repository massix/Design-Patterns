
public abstract class FileHandler {
	protected String fileName;
	
	public FileHandler(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public abstract String getContent();
	public abstract String getLine(int requestedLine);
}
