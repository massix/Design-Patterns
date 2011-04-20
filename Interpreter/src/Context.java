import java.util.Hashtable;


public class Context {
	private Hashtable<String, Boolean> vars;
	
	public Context() {
		vars = new Hashtable<String, Boolean>();
	}
	
	public void assign(VariableExpression var, boolean value) {
		vars.put(var.getVarName(), new Boolean(value));
	}
	
	public boolean lookup(String varName) {
		return ((Boolean) vars.get(varName)).booleanValue();
	}
}
