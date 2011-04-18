
public abstract class Component {
	protected String name;
	protected int price;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void describe();
	
	public void add(Component c) {
		if (this instanceof SinglePart) 
			throw new SinglePartException();
	}
	
	public void remove(Component c) {
		if (this instanceof SinglePart)
			throw new SinglePartException();
	}
	
	public Component getChild(int n) {
		if (this instanceof SinglePart)
			throw new SinglePartException();
		else
			return null;
	}
	
	public int getPrice() {
		return price;
	}
}
