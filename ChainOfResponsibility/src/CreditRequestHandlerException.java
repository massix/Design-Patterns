
public class CreditRequestHandlerException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CreditRequestHandlerException() {
		super("No handler found to forward the request to.");
	}

}
