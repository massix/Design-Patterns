
public class AdministrativeManager extends ResponsibleWorker {

	public AdministrativeManager(Employee employee) {
		super(employee);
	}
	
	@Override
	public void whoIs() {
		sayIamBoss();
		super.whoIs();
	}

	private void sayIamBoss() {
		System.out.print("I am a boss. ");
	}
}
