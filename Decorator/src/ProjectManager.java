
public class ProjectManager extends ResponsibleWorker {
	private String project;
	
	public ProjectManager(Employee employee, String project) {
		super(employee);
		this.project = project;
	}

	@Override
	public void whoIs() {
		super.whoIs();
		System.out.println("And I am the manager of the project " + this.project);
	}
}
