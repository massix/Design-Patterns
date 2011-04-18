
public class SalesManager extends CreditRequestHandler {
	@Override
	public void creditRequest(int amount) throws CreditRequestHandlerException {
		if (amount <= 1000)
			if (Math.random() < .3)
				System.out.println("Accepted by the Sales Manager");
			else
				System.out.println("Not accepted by the Sales Manager");
		else
			forwardCreditRequest(amount);
	}
}
