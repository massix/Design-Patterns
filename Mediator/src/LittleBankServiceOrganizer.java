
public class LittleBankServiceOrganizer implements BankServiceOrganizer {

	private Queue queue1, queue2;
	private Teller teller1, teller2;
	
	public void createBankEntities() {
		queue1 = new Queue(this);
		queue2 = new Queue(this);
		teller1 = new Teller(this);
		teller2 = new Teller(this);
	}
	
	@Override
	public void entityChanged(BankEntity be) {
		if (be == getTeller1()) {
			if (getQueue1().getSize() > 0)
				getTeller1().initService(getQueue1());
			else if (getQueue2().getSize() > 0)
				getTeller1().initService(getQueue2());
		}
		
		else if (be == getTeller2()) {
			if (getQueue2().getSize() > 0)
				getTeller2().initService(getQueue2());
			else if (getQueue1().getSize() > 0)
				getTeller2().initService(getQueue1());
		}
		
		else if (be == getQueue1()) {
			if (getTeller1().isFree())
				getTeller1().initService(getQueue1());
			else if (getTeller2().isFree())
				getTeller2().initService(getQueue1());
		}
		
		else if (be == getQueue2()) {
			if (getTeller2().isFree())
				getTeller2().initService(getQueue2());
			else if (getTeller1().isFree())
				getTeller1().initService(getQueue2());
		}
	}

	public Queue getQueue1() {
		return queue1;
	}

	public Queue getQueue2() {
		return queue2;
	}

	public Teller getTeller1() {
		return teller1;
	}

	public Teller getTeller2() {
		return teller2;
	}
}
