
public class Constant implements BooleanExpression {
	private boolean value;
	
	@Override
	public boolean evaluate(Context context) {
		return value;
	}
	
	public Constant(boolean val) {
		value = val;
	}

}
