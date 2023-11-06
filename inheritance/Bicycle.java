package inheritance;

public class Bicycle {
	public int speed;
	private int gear;
	
	public Bicycle(int startSpeed, int startGear)
	{
		this.speed = startSpeed;
		this.gear = startGear;
	}
	
	public void setGear(int newGear)
	{
		this.gear = newGear;
	}
	public int getGear()
	{
		return gear;
	}
	
	public int speedUp(int inc)
	{
		speed += inc;
		return speed;
	}
	public int speedDown(int dec)
	{
		speed -= dec;
		return speed;
	}
}
