
public class ConsoleReaderException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ConsoleReaderException(Exception e) {
		super(e.toString());
	}
}
