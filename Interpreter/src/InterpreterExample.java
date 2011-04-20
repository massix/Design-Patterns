
public class InterpreterExample {

	public static void main(String[] args) {
		VariableExpression p = new VariableExpression("p");
		VariableExpression q = new VariableExpression("q");
		
		// (true and p) or (q and !p)
		BooleanExpression expr = new OrExpression(
				new AndExpression(new Constant(true), p), 
				new AndExpression(q, new NotExpression(p)));

		Context context = new Context();
		context.assign(p, true);
		context.assign(q, true);
		System.out.println("p: true\nq: true\n   Result: " + expr.evaluate(context));
		
		context.assign(p, true);
		context.assign(q, false);
		System.out.println("p: true\nq: false\n   Result: " + expr.evaluate(context));
		
		context.assign(p, false);
		context.assign(q, true);
		System.out.println("p: false\nq: true\n   Result: " + expr.evaluate(context));
		
		context.assign(p, false);
		context.assign(q, false);
		System.out.println("p: false\nq: false\n   Result: " + expr.evaluate(context));
	}

}
