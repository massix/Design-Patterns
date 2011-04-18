
public class CDRecorder implements Recorder {
	private CD cdInside;

	@Override
	public void accept(Media med) {
		cdInside = (CD) med;
	}

	@Override
	public void record(String record) {
		if (cdInside == null)
			System.out.println("Mi dici come faccio a registrare se non metti un cd dentro, prima? Stronzo?");
		else
			cdInside.writeOnDisk(record);
	}

}
