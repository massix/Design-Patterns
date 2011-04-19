
public class UniversalRemoteControl {
	private Command buttonPower,
					buttonArrowUp,
					buttonArrowDown,
					keypadToEnterNumber;
	
	public UniversalRemoteControl(Command pw, Command au, Command ad, Command nu) {
		buttonPower = pw;
		buttonArrowDown = ad;
		buttonArrowUp = au;
		keypadToEnterNumber = nu;
	}
	
	public void pressButtonPower() {
		buttonPower.execute();
	}
	
	public void pressButtonArrowUp() {
		buttonArrowUp.execute();
	}
	
	public void pressButtonArrowDown() {
		buttonArrowDown.execute();
	}
	
	public void pressKeypadToEnterNumber() {
		keypadToEnterNumber.execute();
	}
}
