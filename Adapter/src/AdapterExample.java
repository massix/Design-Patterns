
public class AdapterExample {
	public static void main(String[] args) {
		/* RECTANGLE CLASS ADAPTER */
		Polygon block = new RectangleClassAdapter();
		block.setId("Rectangle Class Adapter");
		block.define(3, 4, 10, 20, "RED");
		System.out.println("Area of " + block.getId() + " is " +
				block.getSurface() + ", and it's " + block.getColor());

		
		/* RECTANGLE OBJECT ADAPTER */
		Polygon block2 = new RectangleObjectAdapter();
		block2.setId("Rectangle Object Adapter");
		block2.define(5, 3, 15, 30, "YELLOW");
		System.out.println("Area of " + block2.getId() + " is " +
				block2.getSurface() + ", and it's " + block2.getColor());
		
	}

}
