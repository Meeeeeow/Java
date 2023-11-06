package abstraction;

abstract class Shapes {
	void generalMap() {
		System.out.println("concrete method");
	}
	
	abstract void drawing();
	abstract int linesTaken();
}
