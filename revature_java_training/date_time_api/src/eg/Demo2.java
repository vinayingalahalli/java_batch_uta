package eg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {

	public static void main(String[] args) {
		String s="11.11.1111"; //dd.MM.yyyy
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
		if(s.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
		sdf.setLenient(false);
		try {
			Date d=sdf.parse(s);
			System.out.println("Date received is "+d);
		} catch (ParseException e) {
			System.out.println(e);
		}
		}else {
			System.out.println("Invalid");
		}
		

	}

}
//Calendar - GregorainCalendar