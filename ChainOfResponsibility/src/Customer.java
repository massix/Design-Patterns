
public class Customer {
	public void requestCredit(CreditRequestHandler ch, int amount) throws CreditRequestHandlerException {
		ch.creditRequest(amount);
	}
}
