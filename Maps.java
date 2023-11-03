package testjava;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, String> countries = new HashMap<>();
		
		//add 
		countries.put("Bangladesh", "Dhaka");
		countries.put("England", "London");
		countries.put("Australia", "Sydney");
		
		System.out.println(countries);
		System.out.println(countries.get("England"));
		System.out.println(countries.remove("Australia"));
		System.out.println(countries);
		
		if(countries.containsKey("Bangladesh") && countries.containsValue("Dhaka"))
		{
			System.out.println("Dhaka is the capital of Bangladesh.");
		}
		for(String item : countries.keySet())
		{
			System.out.print(item + " ");
			System.out.println(countries.get(item));
		}
		for(String item : countries.values())
		{
			System.out.println(item);
		}

	}

}
