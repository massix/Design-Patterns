
public abstract class CreditRequestHandler {
	private CreditRequestHandler superior;
	
	public void setSuperiorRequestHandler(CreditRequestHandler superior) {
		this.superior = superior;
	}
	
	public void creditRequest(int amount) throws CreditRequestHandlerException {
		forwardCreditRequest(amount);
	}
	
	protected void forwardCreditRequest(int amount) throws CreditRequestHandlerException {
		if (superior != null)
			superior.creditRequest(amount);
		else
			throw new CreditRequestHandlerException();
	}
}
