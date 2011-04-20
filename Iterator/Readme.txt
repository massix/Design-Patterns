The original implementation found in the book of prof. Franco Guidi Polanco provided
a simple example using the builtin methods and types that java offers to the Programmers.

I preferred a different implementation introducing a new class (DestinationsList) that
extends the Java interface ListIterator and hides within an array of Strings (the example
is somewhat stupid but it should make clear what you can achieve by simply extending the
builtin interfaces).

The classes involved, at the senses of the Design Patterns are:
	- DestinationsList: ConcreteIterator
	- ListIterator: interface Iterator
Every other class is hidden in the interface, just like the example provided by Polanco.

Just to be sure, this is the original example:

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExample {
	public static void main(String[] args) {
		LinkedList tour = new LinkedList();
		tour.add("Santiago");
		tour.add("Buenos Aires");
		tour.add("Atlanta");
		tour.add("New York");
		tour.add("Madrid");
		tour.add("Torino");
		tour.add("Napoli");
		ListIterator travel = tour.listIterator();
		System.out.println("Percorso andata");
		while (travel.hasNext())
			System.out.println((String) travel.next());
		
		System.out.println("Percorso ritorno");
		while (travel.hasPrevious())
			System.out.println((String) travel.previous());
	}
}