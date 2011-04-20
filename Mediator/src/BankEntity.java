
public abstract class BankEntity {
	BankServiceOrganizer bOrganizer;
	
	public BankEntity(BankServiceOrganizer bo) {
		bOrganizer = bo;
	}
	
	public void changed() {
		bOrganizer.entityChanged(this);
	}
}
