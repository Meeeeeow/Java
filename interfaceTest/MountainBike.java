package interfaceTest;

public class MountainBike implements Bicycle, Vehicle{
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int height, int gear, int speed)
	{
		this.seatHeight = height;
		this.gear = gear;
		this.speed = speed;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int speedUp(int increment)
	{
		speed += increment;
		return speed;
	}
	public int speedDown(int decrement)
	{
		speed -= decrement;
		return speed;
	}
	public void canDrive() {
		System.out.println("MountainBike is driving!");
	}
}
