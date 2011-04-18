
public class RectangleObjectAdapter implements Polygon {
	private Rectangle adaptee = null;
	private String name = "NO NAME";
	
	public RectangleObjectAdapter() {
		adaptee = new Rectangle();
	}
	
	@Override
	public void define(float x0, float y0, float x1, float y1, String color) {
		adaptee.setShape(x0, y0, x1 - x0, y1 - y0, color);
	}

	@Override
	public String getColor() {
		return adaptee.getColor();
	}

	@Override
	public float[] getCoordinates() {
		float aux[] = new float[4];
		aux[0] = adaptee.getOriginX();
		aux[1] = adaptee.getOriginY();
		aux[2] = adaptee.getOppositeCornerX();
		aux[3] = adaptee.getOppositeCornerY();
		return aux;
	}

	@Override
	public String getId() {
		return name;
	}

	@Override
	public float getSurface() {
		return adaptee.getArea();
	}

	@Override
	public void setId(String id) {
		name = id;
	}

}
