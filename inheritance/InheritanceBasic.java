package inheritance;

public class InheritanceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike bike = new MountainBike(5, 20, 2);
		bike.BikeDesc();
		System.out.println("Speed increased to: " + bike.speedUp(10));
		System.out.println("Bike gear is: " + bike.getGear());
		System.out.println("Seat height is: " + bike.getHeight());
	}

}
