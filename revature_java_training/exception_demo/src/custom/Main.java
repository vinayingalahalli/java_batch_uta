package custom;

public class Main {

	public static void main(String[] args) {
		
		Validator v=new Validator();
		try {
			if(v.isValidUsNumber("+1-2829173999")) {
				System.out.println("Number validated");
			}
		} catch (InvalidMobileException e) {
			System.out.println(e.getMessage());
		}
		try {
		if(v.isValidAge(41)) {
			System.out.println("age validated");
		}
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
