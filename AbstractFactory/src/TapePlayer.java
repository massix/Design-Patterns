
public class TapePlayer implements Player {
	private Tape tapeInside;

	@Override
	public void accept(Media med) {
		tapeInside = (Tape) med;
	}

	@Override
	public void play() {
		if (tapeInside == null)
			System.out.println("Inserisci una cassetta prima, stronzo!");
		else
			System.out.println(tapeInside.readTape());
	}

}
