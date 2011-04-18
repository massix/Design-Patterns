
public abstract class ModelBuilder {
	public void addEntity(String name) {};
	public void addRelationship(String fromEntity, String toEntity, String relation) {};
	public void addCardMin(String entity, String relation, String value) {};
	public void addCardMax(String entity, String relation, String value) {};
	public abstract Object getModel();
}
