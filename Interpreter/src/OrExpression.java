
public class OrExpression implements BooleanExpression {

	BooleanExpression operand1, operand2;
	
	public OrExpression(BooleanExpression op1, BooleanExpression op2) {
		operand1 = op1;
		operand2 = op2;
	}
	
	@Override
	public boolean evaluate(Context context) {
		return operand1.evaluate(context) || operand2.evaluate(context);
	}

}
