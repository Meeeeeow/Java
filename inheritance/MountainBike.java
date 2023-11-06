package inheritance;

public class MountainBike extends Bicycle{
	private int seatheight;
	
	public MountainBike(int seatHeight, int startSpeed, int startGear) {
		super(startSpeed, startGear);
		this.seatheight = seatHeight;
	}
	
	public void setHeight(int height)
	{
		this.seatheight = height;
	}
	public int getHeight()
	{
		return seatheight + 2;
	}
	public void BikeDesc()
	{
//		System.out.println("Bike is speed: " + this.speed + " Gear: "+ this.gear + " and seat height: " + this.seatheight);
		System.out.println("Bike is speed: " + this.speed + " Gear: "+ this.getGear() + " and seat height: " + this.seatheight);
	}
}
