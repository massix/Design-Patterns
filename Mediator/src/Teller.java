
public class Teller extends BankEntity {
	private boolean isFree;
	
	public Teller(BankServiceOrganizer bo) {
		super(bo);
		isFree = true;
	}
	
	public void initService(Queue q) {
		if (isFree) {
			q.dequeue();
			isFree = false;
		}
	}
	
	public void endService() {
		isFree = true;
		changed();
	}
	
	public boolean isFree() {
		return isFree;
	}
}
