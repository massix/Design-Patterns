import java.util.Enumeration;
import java.util.Hashtable;


public class ERModel {
	private Hashtable<String, Entity> modelEntities = new Hashtable<String, Entity>();
	private Hashtable<String, Relationship> modelRelations = new Hashtable<String, Relationship>();

	public void addEntity(String name) {
		modelEntities.put(name, new Entity(name));
	}

	public void addRelationship(String entity1, String entity2, String relation) {
		Relationship rel = new Relationship();
		rel.name = relation;
		rel.entity1 = (Entity) modelEntities.get(entity1);
		rel.entity2 = (Entity) modelEntities.get(entity2);
		modelRelations.put(relation, rel);
	}

	public void addCardMin(String entity, String relation, String value) {
		Relationship rel = (Relationship) modelRelations.get(relation);
		if (entity.equals(rel.entity1.name))
			rel.cardMin1 = value;
		else
			rel.cardMin2 = value;
	}

	public void addCardMax(String entity, String relation, String value) {
		Relationship rel = (Relationship) modelRelations.get(relation);
		if (entity.equals(rel.entity1.name))
			rel.cardMax1 = value;
		else
			rel.cardMax2 = value;
	}

	public void showStructure() {
		for (Enumeration<Relationship> elem = modelRelations.elements(); elem.hasMoreElements(); ) {
			Relationship currRel = (Relationship) elem.nextElement();
			System.out.print("[ " + currRel.entity1.name + " ]---(" + currRel.cardMin1 + "," + currRel.cardMax1 + ")---<" );
			System.out.print(currRel.name + ">---(" + currRel.cardMin2 + "," + currRel.cardMax2);
			System.out.println(")---[ " + currRel.entity2.name + " ]");
		}
	}

}

class Entity {
	public String name;
	public Entity(String name) {
		this.name = name;
	}
}

class Relationship {
	public String name;
	public Entity entity1, entity2;
	public String cardMin1, cardMax1, cardMin2, cardMax2;
}