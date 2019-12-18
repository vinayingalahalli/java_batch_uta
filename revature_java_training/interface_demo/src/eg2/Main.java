package eg2;

public class Main {
public static void main(String[] args) {
	Parent p=new Implementor();
	
	
	Child c=new Implementor();
	
	Child.Inner i=new Implementor();
}
}
