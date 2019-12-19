package real_world_objects;

import java.util.Set;
import java.util.TreeSet;

public class FlightMain {

	public static void main(String[] args) {
		//Set<Flight> flightsList = new HashSet<>();
		Set<Flight> flightsList = new TreeSet<>(); //fix the error
		flightsList.add(new Flight(100, "abc", 212.33, 2.3f));
		flightsList.add(new Flight(190, "xyz", 120.33, 2.3f));
		flightsList.add(new Flight(101, "abc", 121.33, 1.3f));
		flightsList.add(new Flight(120, "pqr", 122.33, 2.3f));
		flightsList.add(new Flight(110, "java", 112.33, 4.3f));
		flightsList.add(new Flight(109, "jee", 120.33, 4.9f));
		flightsList.add(new Flight(110, "java", 112.33, 4.3f));
		flightsList.add(new Flight(110, "java", 112.33, 4.3f));
		flightsList.add(new Flight(110, "java", 112.33, 4.3f));
		flightsList.add(new Flight(111, "java", 112.33, 4.3f));
		System.out.println("Printing all flights");
		printFlights(flightsList);
		
	}

	public static void printFlights(Set<Flight> flightsList) {
		for(Flight f:flightsList) {
			System.out.println(f);
		}
	}

}
