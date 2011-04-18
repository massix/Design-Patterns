
public class SinglePartException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SinglePartException() {
		super("Method not available for that object");
	}
}
