
public class CompositeExample {
	public static void main(String[] args) {
		Component monitor = new SinglePart("LCD Monitor", 115);
		Component keyboard = new SinglePart("US Keyboard", 20);
		Component processor = new SinglePart("Pentium IV 2,66GHz processor", 150);
		Component ram = new SinglePart("1GB RAM", 90);
		Component hardDisk = new SinglePart("1024Gb Hard Disk", 50);
		
		Component mainSystem = new CompoundPart("Main System");
		mainSystem.add(processor);
		mainSystem.add(ram);
		mainSystem.add(hardDisk);
		
		Component computer = new CompoundPart("Computer");
		computer.add(monitor);
		computer.add(keyboard);
		computer.add(mainSystem);
		
		monitor.describe();
		mainSystem.describe();
		computer.describe();
		
		try {
			monitor.add(keyboard);
		}
		catch (SinglePartException e) {
			e.printStackTrace();
		}
		
		try {
			monitor.getChild(3); 
		}
		catch (SinglePartException e) {
			e.printStackTrace();
		}
		
	}
}
