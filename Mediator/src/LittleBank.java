
public class LittleBank {
	private Queue queue1, queue2;
	private Teller teller1, teller2;
	
	public LittleBank() {
		LittleBankServiceOrganizer lbso = new LittleBankServiceOrganizer();
		lbso.createBankEntities();
		queue1 = lbso.getQueue1();
		queue2 = lbso.getQueue2();
		teller1 = lbso.getTeller1();
		teller2 = lbso.getTeller2();
	}
	
	public void customerArriveToQ1() {
		queue1.enqueue();
	}
	
	public void customerArriveToQ2() {
		queue2.enqueue();
	}
	
	public void endServiceTeller1() {
		teller1.endService();
	}
	
	public void endServiceTeller2() {
		teller2.endService();
	}
	
	public void showStatus() {
		System.out.println("----------------------");
		System.out.println("Teller 1 status: " + (teller1.isFree()? "FREE": "BUSY"));
		System.out.println("Teller 2 status: " + (teller2.isFree()? "FREE": "BUSY"));
		
		System.out.println("Queue 1 size: " + queue1.getSize());
		System.out.println("Queue 2 size: " + queue2.getSize());
	}
}
