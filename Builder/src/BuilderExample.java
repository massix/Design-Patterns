
public class BuilderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String swIngCourseModel = (String) ERHardCodedDirector.getModel(new OrientedERBuilder());
		ERModel dbCourseModel = (ERModel) ERHardCodedDirector.getModel(new NotOrientedERBuilder());

		System.out.println(swIngCourseModel);
		dbCourseModel.showStructure();

	}

}
