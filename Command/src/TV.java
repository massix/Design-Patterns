
public class TV {
	public enum TV_STATE {
		OFF,
		ON
	}
	
	private TV_STATE power 	= TV_STATE.OFF;
	private int volume 		= 0;
	private int channel 	= 2;
	
	public void power() {
		if (power == TV_STATE.OFF) {
			power = TV_STATE.ON;
			System.out.println("TV turned on");
		}
		else {
			power = TV_STATE.OFF;
			System.out.println("TV turned off");
		}
	}
	
	public void volumeUp() {
		if (power == TV_STATE.ON) {
			if (volume < 10)
				volume++;
			System.out.println("Volume level: " + volume);
		}
		else
			System.out.println("You must turn on the TV");
	}
	
	public void volumeDown() {
		if (power == TV_STATE.ON) {
			if (volume > 0)
				volume--;
			System.out.println("Volume level: " + volume);
		}
		else
			System.out.println("You must turn on the TV");
	}
	
	public void setChannel(int ch) {
		if (power == TV_STATE.ON) {
			if (ch >= 2 && ch < 140)
				channel = ch;
			System.out.println("Current channel is " + channel);
		}
		else
			System.out.println("You must turn on the TV");
	}	
}
