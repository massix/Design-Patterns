import java.util.Enumeration;
import java.util.ListIterator;


public class IteratorExample {
	public static void main(String[] args) {
		DestinationsList destinations = new DestinationsList(7);
		
		destinations.add("Santiago");
		destinations.add("Buenos Aires");
		destinations.add("Atlanta");
		destinations.add("New York");
		destinations.add("Madrid");
		destinations.add("Torino");
		destinations.add("Napoli");
		
		/* 
		 * This doesn't make much sense since the DestinationsList class
		 * is a derived of an Enumeration itself..
		 */
		ListIterator<String> travel = destinations;
		System.out.println("Viaggio d'andata");
		while (travel.hasNext())
			System.out.println(travel.next());
		
		System.out.println("\n\nViaggio di ritorno");
		while (travel.hasPrevious())
			System.out.println(travel.previous());
	}
}
