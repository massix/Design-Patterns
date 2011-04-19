
public class TVPowerCommand implements Command {

	private TV theTV;
	
	public TVPowerCommand(TV theTV) {
		this.theTV = theTV;
	}
	
	@Override
	public void execute() {
		theTV.power();
	}

}
