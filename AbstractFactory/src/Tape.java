
public class Tape implements Media {
	private String tape = "";

	public Tape() {

	}

	public void saveOnTape(String sound) {
		tape = sound;
	}

	public String readTape() {
		return tape;
	}
}
