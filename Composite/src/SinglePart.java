
public class SinglePart extends Component {
	
	public SinglePart(String name, int price) {
		super(name);
		this.price = price;
	}

	@Override
	public void describe() {
		System.out.println("Component: " + name + " costs " + price + "€");
	}

}
