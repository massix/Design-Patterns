
public class NotExpression implements BooleanExpression {

	BooleanExpression operand;
	
	public NotExpression(BooleanExpression op) {
		operand = op;
	}
	
	@Override
	public boolean evaluate(Context context) {
		return !operand.evaluate(context);
	}

}
