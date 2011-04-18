
public class Singleton {
	private static Singleton _instance = null;
	public int value;

	public static Singleton getInstance() {
		if (_instance == null)
			_instance = new Singleton();
		return _instance;
	}
	
	protected Singleton() {
		value = 0;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Singleton j = Singleton.getInstance();
		j.setValue(15);
		Singleton k = Singleton.getInstance();
		k.setValue(30);
		
		System.out.println (j.value + " " + k.value);
	}
}
