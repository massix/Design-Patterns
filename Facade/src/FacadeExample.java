
public class FacadeExample {
	public static void main(String[] args) {
		ConsoleReader reader = new ConsoleReader(ConsoleReader.Mode.SECURE_MODE_ON);
		ConsoleReader secureReader = new ConsoleReader(ConsoleReader.Mode.SECURE_MODE_OFF);
		String text = null;
		int num = 0;
		double doub = 0;
		
		
		System.out.println("SECURE MODE: Insert text, num and double. All followed by the enter key.");
		try {
			text = reader.readString();
			num = reader.readInteger();
			doub = reader.readDouble();
		} catch (ConsoleReaderException e) {
			System.out.println("WTF? " + e.getMessage());
		} finally {
			System.out.println("Inserted so far: " + text + " " + num + " " + doub);
		}
		
		System.out.println("NON SECURE MODE: Insert text, num ad double. All followed by the enter key.");
		text = secureReader.readString();
		num = secureReader.readInteger();
		doub = secureReader.readDouble();
		
		System.out.println("Inserted so far: " + text + " " + num + " " + doub);
		
	}
}
