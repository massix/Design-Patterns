
public class ProxyExample {
	public static void main(String[] args) {
		FileHandler fh = new ProxyFileHandler("SampleFile.txt");
		System.out.println("Filename: " + fh.getFileName());
		
		System.out.println("=== FILE CONTENT ===\n" + fh.getContent());
		
		System.out.println("=== FILE CONTENT AGAIN ===\n" + fh.getContent());
		
		System.out.println("Content of line 2: " + fh.getLine(2));
		
		System.out.println("Content of line 2 (again): " + fh.getLine(2));
		
		System.out.println("Content of line 4: " + fh.getLine(4));
	}
}
