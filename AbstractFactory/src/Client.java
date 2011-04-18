
public class Client {
	private DevicesFactory technology;

	public void selectTechnology(DevicesFactory df) {
		technology = df;
	}

	public void test(String song) {
		Media media = technology.createMedia();
		Player player = technology.createPlayer();
		Recorder recorder = technology.createRecorder();

		recorder.accept(media);
		recorder.record(song);

		player.accept(media);
		player.play();
	}

	public static void main(String[] args) {
		Client c = new Client();

		c.selectTechnology(new CDDevicesFactory());
		c.test("This is a song I wrote for youuu from a cidiiiii");

		c.selectTechnology(new TapeDevicesFactory());
		c.test("This is a song from a tapeeeeeeee");
	}
}
