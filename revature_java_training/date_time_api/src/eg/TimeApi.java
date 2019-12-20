package eg;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeApi {

	public static void main(String[] args) {
		LocalDate ld1=LocalDate.now();
		System.out.println(ld1);
		LocalDate ld2=LocalDate.parse("10.10.2010",DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println(ld2);
		ld2=ld2.plusYears(5);
		System.out.println(ld2);
		
		
		Period p=Period.between(ld2, ld1);
		System.out.println("Years "+p.getYears());
		System.out.println("Months "+p.getMonths());
		System.out.println("Days "+p.getDays());
		
		System.out.println(ChronoUnit.DAYS.between(ld2, ld1));
		
		//LocalTime, LocalDateTime, Zone, Locale
		

	}

}
