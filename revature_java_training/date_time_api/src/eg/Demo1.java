package eg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		/*
		 * dd - date
		 * MM - month in 2 digits , MMM - short name, MMMM - full name
		 * yy - last 2 digits of year, yyyy - full year
		 * hh - 12hour
		 * HH - 24 hour
		 * mm -minutes
		 * ss - seconds
		 * EEE - dayname in short, EEEE - full name of the day
		 * a - AM/PM
		 * z/Z - zone & GMT
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM/yyyy/dd EEE  HH:hh - mm:ss a z Z");
		System.out.println(sdf.format(d));
		

	}

}
