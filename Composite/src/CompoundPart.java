import java.util.Iterator;
import java.util.LinkedList;

public class CompoundPart extends Component {
	private LinkedList<Component> children;
	
	public CompoundPart(String name) {
		super(name);
		children = new LinkedList<Component>();
	}

	@Override
	public void describe() {
		getPrice();
		System.out.println("Component: " + name);
		System.out.println("\tcomposed by {");
		
		Iterator<Component> it = children.iterator();
		while (it.hasNext()) {
			Component c = it.next();
			System.out.print("\t\t");
			c.describe();
		}
		System.out.println("\t}");
		System.out.println("Total cost: " + price);
	}
	
	@Override
	public void add(Component c) throws SinglePartException {
		children.add(c);
	}
	
	@Override
	public void remove(Component c) throws SinglePartException {
		children.remove(c);
	}
	
	@Override
	public Component getChild(int num) throws SinglePartException {
		return children.get(num);
	}

	@Override
	public int getPrice() {
		price = 0;
		Iterator<Component> it = children.iterator();
		while (it.hasNext()) 
			price += it.next().getPrice();
		
		return price;
	}
}
