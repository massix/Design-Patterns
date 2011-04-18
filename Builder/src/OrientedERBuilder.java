import java.util.Enumeration;
import java.util.Hashtable;


public class OrientedERBuilder extends ModelBuilder {
	private Hashtable<String, String[]> relations;

	public OrientedERBuilder() {
		relations = new Hashtable<String, String[]>();
	}

	public void addRelationship(String from, String to, String relation) {
		String[] relDetail = { from, to, "0", "0" };
		relations.put(relation, relDetail);
	}

	public void addCardMax(String entity, String relation, String value) {
		String[] relDetail = (String[]) relations.get(relation);
		if (entity.equals(relDetail[0]))
			relDetail[3] = value;
		else
			relDetail[2] = value;

		relations.put(relation, relDetail);
	}

	@Override
	public Object getModel() {
		String model = "";
		for (Enumeration<String[]> elem = relations.elements(); elem.hasMoreElements(); ) {
			String[] currEl = (String[]) elem.nextElement();
			model += "[ " + currEl[0] + " ]---(" + currEl[2] + "," + currEl[3] + ")---[ " + currEl[1] + " ]\n";
		}

		return model;
	}

}
