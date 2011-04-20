import java.util.Enumeration;
import java.util.ListIterator;


public class DestinationsList implements ListIterator<String> {

	private String[] destinations;
	private int index;
	private int internal_index;
	private int maxValue;
	
	public DestinationsList(int maxValue) {
		index = internal_index = 0;
		this.maxValue = maxValue;
		destinations = new String[maxValue+1];
	}
	
	@Override
	public void add(String value) {
		if (internal_index < maxValue)
			destinations[internal_index++] = value;
		
	}

	@Override
	public boolean hasNext() {
		if (index < maxValue && destinations[index + 1] != "") 
			return true;
		
		else
			return false;
	}

	@Override
	public boolean hasPrevious() {
		if (index > 0 && destinations[index - 1] != "") 
			return true;
		
		else
			return false;
	}

	@Override
	public String next() {
		return destinations[index++];
	}

	@Override
	public int nextIndex() {
		return ++index;
	}

	@Override
	public String previous() {
		return destinations[--index];
	}

	@Override
	public int previousIndex() {
		return --index;
	}

	@Override
	public void remove() {
		// Not implemented
	}

	@Override
	public void set(String arg0) {
		// Not implemented
	}

}
