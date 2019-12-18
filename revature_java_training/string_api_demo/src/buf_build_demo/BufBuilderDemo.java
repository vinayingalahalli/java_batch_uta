package buf_build_demo;

public class BufBuilderDemo {

	public static void main(String[] args) {
	
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb);
		sb.append(true).append(123.45).append("heyyy").append('c');
		System.out.println(sb);
		sb.insert(2, "JAVA");
		System.out.println(sb);
		sb.delete(7, 9);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		int x=101;
		String s=x+"";
		if(new StringBuilder(s).reverse().toString().equals(s)) {
			System.out.println("Palin");
		}else {
			System.out.println("not palin");
		}
		
		
	}

}
