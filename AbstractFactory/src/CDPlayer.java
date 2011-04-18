
public class CDPlayer implements Player {
	private CD cdInside;

	@Override
	public void accept(Media med) {
		cdInside = (CD) med;
	}

	@Override
	public void play() {
		if (cdInside == null)
			System.out.println("Errore, inserisci un cd. Stronzo!");
		else
			System.out.println(cdInside.readDisk());
	}

}
