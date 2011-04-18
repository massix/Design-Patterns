import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
	public static enum Mode {
		SECURE_MODE_ON,
		SECURE_MODE_OFF
	}
	
	private BufferedReader br;
	private Mode mode;
	
	public ConsoleReader() {
		this(Mode.SECURE_MODE_ON);
	}
	
	public ConsoleReader(Mode m) {
		br = new BufferedReader(new InputStreamReader(System.in));
		mode = m;
	}
	
	public String readString() {
		try {
			return br.readLine();
		} catch(Exception e) {
			if (mode == Mode.SECURE_MODE_ON)
				throw new ConsoleReaderException(e);
			return "";
		}
	}
	
	public Integer readInteger() {
		Integer theInteger = null;
		try {
			theInteger = new Integer(br.readLine());
		} catch (Exception e) {
			if (mode == Mode.SECURE_MODE_ON)
				throw new ConsoleReaderException(e);
			theInteger = new Integer(0);
		}
		
		return theInteger;
	}
	
	public Double readDouble() {
		Double theDouble = null;
		try {
			theDouble = new Double(br.readLine());
		} catch (Exception e) {
			if (mode == Mode.SECURE_MODE_ON)
				throw new ConsoleReaderException(e);
			theDouble = new Double(0);
		}
		
		return theDouble;
	}
}
