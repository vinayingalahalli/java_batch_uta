package real_world_objects;

import java.util.Comparator;

public class FlightNameComparator implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
