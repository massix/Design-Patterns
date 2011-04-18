
public class ChainOfResponsibilityExample {
	public static void main(String[] args) {
		ClientAccountManager cam = new ClientAccountManager();
		SalesManager sm = new SalesManager();
		Vendor v = new Vendor();
		
		v.setSuperiorRequestHandler(sm);
		sm.setSuperiorRequestHandler(cam);
		
		Customer c = new Customer();
		for (int i = 500; i <=2500; i += 500) {
			System.out.println("Credit request for $" + i);
			try {
				c.requestCredit(v, i);
			}
			catch (CreditRequestHandlerException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
}
