package real_world_objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightMain {

	public static void main(String[] args) {

		List<Flight> flightsList = new ArrayList<>();
		flightsList.add(new Flight(100, "abc", 212.33, 2.3f));
		flightsList.add(new Flight(190, "xyz", 120.33, 2.3f));
		flightsList.add(new Flight(101, "abc", 121.33, 1.3f));
		flightsList.add(new Flight(120, "pqr", 122.33, 2.3f));
		flightsList.add(new Flight(110, "java", 112.33, 4.3f));
		flightsList.add(new Flight(109, "jee", 120.33, 4.9f));
		System.out.println("Printing all flights");
		printFlights(flightsList);
		
		Collections.sort(flightsList);
		System.out.println("Printing all flights sorted by Id");
		printFlights(flightsList);
		Collections.sort(flightsList,new FlightNameComparator());
		System.out.println("\nPrinting all flights sorted by name");
		printFlights(flightsList);
		Collections.sort(flightsList, (f1,f2)->{
			Double d1=f1.getCost();
			Double d2=f2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting all flights sorted by cost");
		printFlights(flightsList);
		Collections.sort(flightsList, (f1,f2)->{
			Float r1=f1.getRatings();
			Float r2=f2.getRatings();
			int x=r2.compareTo(r1);
			if(x==0) {
				Double d1=f1.getCost();
				Double d2=f2.getCost();
				return d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\nPrinting all flights sorted by ratings and then by cost");
		printFlights(flightsList);
	}

	public static void printFlights(List<Flight> flightsList) {
		for (int i = 0; i < flightsList.size(); i++) {
			System.out.println(flightsList.get(i));
		}
	}

}
