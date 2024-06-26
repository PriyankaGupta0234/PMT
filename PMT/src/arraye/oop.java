package arraye;

public class oop {
	String s;
	int a; 
	static int r;
	
	public static void main(String[] args) {
		int b = 10;//local
        System.out.println(b);
        //System.out.println(a);   will throw error
        oop oop = new oop();
        System.out.println(b);
        System.out.println(oop.a);
        System.out.println(oop.s);
        System.out.println(r);
        System.out.println(oop.r);
        System.out.println(oop.r);

	}
}
