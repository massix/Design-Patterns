
public class NotOrientedERBuilder extends ModelBuilder {
	private ERModel erModel;

	public NotOrientedERBuilder() {
		erModel = new ERModel();
	}

	public void addEntity(String name) {
		erModel.addEntity(name);
	}

	public void addRelationship(String from, String to, String relation) {
		erModel.addRelationship(from, to, relation);
	}

	public void addCardMin(String entity, String relation, String value) {
		erModel.addCardMin(entity, relation, value);
	}

	public void addCardMax(String entity, String relation, String value) {
		erModel.addCardMax(entity, relation, value);
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return erModel;
	}

}
