package interfaceTest;

public class interfaceDemo {
	public static void main(String[]args) {
		MountainBike m = new MountainBike(5, 2, 20);
		System.out.println(m.getGear());
		System.out.println(m.getSpeed());
		System.out.println("Speed is: " + m.speedUp(10));
		m.canDrive();
	}
}
