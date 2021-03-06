package example1;

public class RegEx {

	public static void main(String[] args) {
		/*
		 * RegEx - regular Expression
		 * Pattern Matching Algo
		 * [] - represents expression
		 * {} - length
		 * ^ - not
		 * [0-9]{3} - any 3 digits
		 * [a-z]{5,10} - any word of min length 5 and max length of 10
		 * [A-Z]{1,} - min 1 uppercase letter and max can be any
		 * [^0-9] - apart from digits
		 *   +?. () - explore
		 */
		
		String s="H8elLLOO 123@##)_Hi  K";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", ""));
		
		String s1="ACDEF1678Q";
		if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
		String u="1-7895607890";
		if(u.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid number");
		}else {
			System.out.println("Invalid Number");
		}

	}

}


// Explore on what is :: operator

