
public class DecoratorExample {
	public static void main(String[] args) {
		Employee willBeFamous = new Engineer("William Wallace", "Scotland freedom");
		willBeFamous.whoIs();
		System.out.println();
		
		/* Career increase! William becomes an Administrative Manager */
		willBeFamous = new AdministrativeManager(willBeFamous);
		willBeFamous.whoIs();
		System.out.println();
		
		
		/* Career increase! William manages now the project "Scotland Liberation Army" */
		willBeFamous = new ProjectManager(willBeFamous, "Scotland Liberation Army");
		willBeFamous.whoIs();
		System.out.println();
		
		
		/* And the project "Freedom for Scotland" */
		willBeFamous = new ProjectManager(willBeFamous, "Freedom for Scotland");
		willBeFamous.whoIs();
		System.out.println();
		
		
		/* But his Liberation Army failed and he changed his work, starting from 0 */
		willBeFamous = new Engineer("William Wallace", "Free England");
		willBeFamous.whoIs();
	}
}
