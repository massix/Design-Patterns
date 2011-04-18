import java.util.Hashtable;


public class EventSymbolFactory {
	private static Hashtable<String, EventSymbol> events = new Hashtable<String, EventSymbol>();
	
	public static EventSymbol newEventSymbol(String evnt) {
		EventSymbol evntRef = (EventSymbol) events.get(evnt);
		if (evntRef == null) {
			evntRef = new EventSymbol(evnt);
			events.put(evnt, evntRef);
		}
		
		return evntRef;
	}
}
