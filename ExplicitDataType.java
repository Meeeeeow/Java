package testjava;

public class ExplicitDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1243.454;
		System.out.println("Double: " + a);
		float f = (float)a;
		System.out.println("float representation: " + f);
		long l = (long)f;
		System.out.println("long representation: " + l);
		int i = (int)l;
		System.out.println("Int representation: " + i);

	}

}
