package JFS_10KC;

public class NonStaticVariables {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bo;
	public static void main(String[] args) {
		NonStaticVariables ns=new NonStaticVariables();
		System.out.println(ns.b);
		System.out.println(ns.s);
		System.out.println(ns.i);
		System.out.println(ns.l);
		System.out.println(ns.f);
		System.out.println(ns.d);
		System.out.println(ns.c);
		System.out.println(ns.bo);
	}
}
