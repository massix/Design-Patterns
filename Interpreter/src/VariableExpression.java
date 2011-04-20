
public class VariableExpression implements BooleanExpression {

	private String varName;
	
	@Override
	public boolean evaluate(Context context) {
		return context.lookup(varName);
	}
	
	public VariableExpression(String name) {
		varName = name;
	}

	public String getVarName() {
		return varName;
	}

}
