
public class TVVolumeUpCommand implements Command {

	private TV theTV;
	
	public TVVolumeUpCommand(TV theTV) {
		this.theTV = theTV;
	}
	
	@Override
	public void execute() {
		theTV.volumeUp();
	}
}
