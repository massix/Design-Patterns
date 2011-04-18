public class Rectangle {
	private float x0, y0;
	private float height, width;
	private String color;
	
	public void setShape(float x, float y, float a, float l, String c) {
		x0 = x;
		y0 = y;
		height = a;
		width = l;
		color = c;
	}
	
	public float getArea() {
		return x0 * y0;
	}
	
	public float getOriginX() {
		return x0;
	}
	
	public float getOriginY() {
		return y0;
	}
	
	public float getOppositeCornerX() {
		return x0 + height;
	}
	
	public float getOppositeCornerY() {
		return y0 + width;
	}
	
	public String getColor() {
		return color;
	}
}
