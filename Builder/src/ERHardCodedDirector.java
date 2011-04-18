
public class ERHardCodedDirector {
	public static Object getModel(ModelBuilder model) {
		model.addEntity("Student");
		model.addEntity("University");
		model.addEntity("Professor");

		model.addRelationship("Student", "University", "Studies at");
		model.addCardMin("Student", "Studies at", "1");
		model.addCardMax("Student", "Studies at", "1");
		model.addCardMin("University", "Studies at", "0");
		model.addCardMax("University", "Studies at", "N");

		model.addRelationship("University", "Professor", "Has");
		model.addCardMin("University", "Has", "0");
		model.addCardMax("University", "Has", "N");
		model.addCardMin("Professor", "Has", "1");
		model.addCardMax("Professor", "Has", "N");

		return model.getModel();
	}
}
