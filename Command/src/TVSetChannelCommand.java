import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TVSetChannelCommand implements Command {

	private TV theTV;
	
	public TVSetChannelCommand(TV theTV) {
		this.theTV = theTV;
	}
	
	@Override
	public void execute() {
		theTV.setChannel(acceptNumber());
	}

	private int acceptNumber() {
		int chInput = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter the channel number: ");
			chInput = Integer.parseInt(br.readLine());
		}
		catch (IOException e) {
			System.out.println("Error (" + e.getLocalizedMessage() + ")");
		}
		
		return chInput;
	}
}
