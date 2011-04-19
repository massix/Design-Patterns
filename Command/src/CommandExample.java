import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CommandExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		TV aCommonTV = new TV();
		
		UniversalRemoteControl remote = new UniversalRemoteControl(
					new TVPowerCommand(aCommonTV),
					new TVVolumeUpCommand(aCommonTV),
					new TVVolumeDownCommand(aCommonTV),
					new TVSetChannelCommand(aCommonTV));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nOption = 0;
		while (nOption != 9) {
			System.out.println("Select a button to press or 9 to exit");
			System.out.println("   1. Power");
			System.out.println("   2. Arrow UP");
			System.out.println("   3. Arrow DOWN");
			System.out.println("   4. Numeric Keypad");
			nOption = Integer.parseInt(br.readLine());
			switch (nOption) {
				case 1: 
					remote.pressButtonPower();
				break;
				case 2:
					remote.pressButtonArrowUp();
				break;
				case 3:
					remote.pressButtonArrowDown();
				break;
				case 4:
					remote.pressKeypadToEnterNumber();
				break;
			}
		}
	}
}
