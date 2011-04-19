
public class TVVolumeDownCommand implements Command {

	private TV theTV;
	
	public TVVolumeDownCommand(TV theTV) {
		this.theTV = theTV;
	}
	
	@Override
	public void execute() {
		theTV.volumeDown();
	}

}
