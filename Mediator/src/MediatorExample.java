
public class MediatorExample {
	public static void main(String[] args) {
		LittleBank bank = new LittleBank();
		
		bank.showStatus();
		
		System.out.println("A customer arrives to queue 1");
		bank.customerArriveToQ1();
		bank.showStatus();
		
		System.out.println("A customer arrives to queue 1");
		bank.customerArriveToQ1();
		bank.showStatus();
		
		System.out.println("A customer arrives to queue 1");
		bank.customerArriveToQ1();
		bank.showStatus();
		
		System.out.println("A customer arrives to queue 2");
		bank.customerArriveToQ2();
		bank.showStatus();
		
		System.out.println("End of service Teller 1");
		bank.endServiceTeller1();
		bank.showStatus();
		
		System.out.println("End of service Teller 2");
		bank.endServiceTeller2();
		bank.showStatus();
		
		System.out.println("End of service Teller 2");
		bank.endServiceTeller2();
		bank.showStatus();
		
		System.out.println("End of service Teller 1");
		bank.endServiceTeller1();
		bank.showStatus();
	}
}
