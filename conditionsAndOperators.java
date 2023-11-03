package testjava;

public class conditionsAndOperators {
	public static void main(String args[])
	{
		//Bitwise operations
		int a = 2; //0010 
		int b = 3; //0011
		System.out.println(a & b); //0010 --> 2 (AND)
		System.out.println(a | b); //0011 --> 3 (OR)
		System.out.println(a ^ b); //0001 --> 1 (XOR)
		System.out.println(~b); //-(3 + 1) = -4
		
		//Shifting
		System.out.println(a << 2); //1000 --> 8
		System.out.println(b >> 2); //0000 --> 0
		
		//String operations
		String name = "Shiro";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("h"));
		System.out.println(name.equalsIgnoreCase("shiro"));
		System.out.println(name.replace("o", "w"));
		if(name.contains("h"))
		{
			System.out.println("H is present!");
		}else {
			System.out.println("H is not present!");
		}
		boolean result = name.contains("s".toUpperCase());
		if(result)
		{
			System.out.println("Hello S is present!");
		}else {
			System.out.println("Not present!!");
		}
		
		//switch
		int age = 12;
		switch(age)
		{
			case 21,22,23:
				System.out.println("You are not old enough");
				break;
			case 25,26,27,28,29,30:
				System.out.println("Old enough!!");
				break;
			default:
				System.out.println("Not in our radar!");
				break;
		}
	}
}
