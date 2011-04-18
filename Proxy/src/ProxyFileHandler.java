
public class ProxyFileHandler extends FileHandler {
	private RealFileHandler realHandler;
	private int lineNumber;
	private String lineText;
	
	public ProxyFileHandler(String fileName) {
		super(fileName);
	}

	@Override
	public String getContent() {
		if (realHandler == null)
			realHandler = new RealFileHandler(fileName);
		
		return realHandler.getContent();
	}

	@Override
	public String getLine(int requestedLine) {
		if (requestedLine == lineNumber) {
			System.out.println("Accessing from proxy cache");
			return lineText;
		}
		else {
			if (realHandler == null)
				realHandler = new RealFileHandler(fileName);
			
			lineText = realHandler.getLine(requestedLine);
			lineNumber = requestedLine;
		}
		
		return lineText;
	}
}
