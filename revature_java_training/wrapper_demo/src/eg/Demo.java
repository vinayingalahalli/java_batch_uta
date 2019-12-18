package eg;

public class Demo {

	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=10;
		Integer i3=11;
		Integer i4=new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		int x=i4;
		System.out.println("x = "+x);
		x=100;
		i4=x; //autoboxing
		System.out.println("i4 = "+i4);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		
		String s="1000";
		x=Integer.parseInt(s);//String to int/Integer
		System.out.println(x);
		x=99999;
		s=x+""; //converted to String
		System.out.println(s);
		s=i4.toString();
		System.out.println(s);
		System.out.println(Integer.toBinaryString(11));
		System.out.println(Integer.toHexString(10000));
		
		Integer i5=99;
		System.out.println(i5.compareTo(977)); //0 +ve -ve
		
		float f=i5.floatValue();
		System.out.println(f);
		
		Double d=999.9999;
		x=d.intValue();
		System.out.println(x);
		
		
		
		
		//Long Double & Float
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
