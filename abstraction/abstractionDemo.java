package abstraction;

public class abstractionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes c = new Circle(1);
		Circle c1 = new Circle(2);
		c.drawing();
		System.out.println("lines taken: " + c.linesTaken());
		System.out.println(c1.linesTaken());
		Rectangle r = new Rectangle();
		r.drawing();
	}

}
