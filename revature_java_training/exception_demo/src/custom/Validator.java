package custom;

public class Validator {

	public boolean isValidUsNumber(String contact) throws InvalidMobileException {
		if(!contact.matches("\\+1-[0-9]{10}")) {
			throw new InvalidMobileException("Entered contact "+contact+" is not a valid US number");
		}
		return true;
	}
	
	public boolean isValidAge(int age) {
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be -ve or zero");
		}
		if(age<20 || age>40) {
			throw new InvalidAgeException("Customers between 20 to 40 are allowed only");
		}
		
		return true;
	}
}
