
public class TapeRecorder implements Recorder {
	private Tape tapeInside;

	public TapeRecorder() {

	}

	@Override
	public void accept(Media med) {
		tapeInside = (Tape) med;
	}

	@Override
	public void record(String record) {
		if (tapeInside == null)
			System.out.println("errore, nessuna cassetta inserita");
		else
			tapeInside.saveOnTape(record);
	}

}
