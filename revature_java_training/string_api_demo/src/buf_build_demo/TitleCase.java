package buf_build_demo;

public class TitleCase {

	public static void main(String[] args) {
		String s="hello hi good afternoon. feeling sleepy?";
		StringBuilder sb=new StringBuilder();
		String s1[]=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			sb.append(Character.toUpperCase(s1[i].charAt(0))).append(s1[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
