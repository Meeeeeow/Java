package testjava;

public class OOP {
	boolean lightsOn;
	String name;
	int age;
	String address;
	public OOP(boolean lightsOn, String name, int age, String address) {
		this.lightsOn = lightsOn;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public OOP(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public OOP() {
		this.name = "Adam";
		this.age =38;
		this.address = "AUS";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setLightsOn(boolean lightsOn)
	{
		this.lightsOn = lightsOn;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public boolean getLightsOn() {
		return lightsOn;
	}
	
	public void intro() {
		System.out.println("Hello! I am "+ this.name + " age: " + this.age + " address is: " + this.address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOP s1 = new OOP();
		s1.setName("Ravindra");
		s1.setAge(25);
		s1.setAddress("Sydney");
		System.out.println(s1.name + " Age: "+ s1.age + " Address: "+ s1.address);
		System.out.println(s1.getName() + " Age: "+ s1.getAge() + " Address: "+ s1.getAddress());
		
		OOP s2 = new OOP("Klassen", 28, "SA");
		System.out.println(s2.name + " Age: "+ s2.age + " Address: "+ s2.address);
		s2.intro();
		
		OOP s3 = new OOP();
		System.out.println(s3.getName() + " Age: "+ s3.getAge() + " Address: "+ s3.getAddress());
		s3.intro();
	}

}
