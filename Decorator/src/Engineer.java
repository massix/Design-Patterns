
public class Engineer implements Employee {
	private String name, office;
	
	public Engineer(String name, String office) {
		this.name = name;
		this.office = office;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getOffice() {
		return office;
	}

	@Override
	public void whoIs() {
		System.out.println("I am " + getName() + ", and I work for " + getOffice());
	}

}
