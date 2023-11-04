package testjava;
import java.util.*;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		boolean close = true;
		while(close)
		{
			try {
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					print(stack);
					break;
				case 2:
					peek(stack);
					break;
				case 3:
					add(stack);
					break;
				case 4:
					remove(stack);
					break;
				case 5:
					search(stack);
					break;
				default:
					System.out.println("Wrong option taken!! Try again?? y/n");
					Scanner sc2 = new Scanner(System.in);
					String response = sc2.nextLine();
					System.out.println(response);
					if(response.equals("n"))
					{
						close = false;
						System.out.println("Thank you for playing!!!");
						break;
					}
				}
			}catch(Exception e)
			{
				System.out.println("Error message: " + e);
				close = false;
				System.out.println("Please try hard! ");
			}
		}
	}
	private static void search(Stack<String> stack) {
		// TODO Auto-generated method stub
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter an element to look up: ");
		String item = sc3.nextLine();
		int pos = stack.search(item);
		System.out.println(pos);
		if(pos == -1)
		{
			System.out.println("ITem not found!!");
		}else {
			System.out.println("Item is in position: " + pos);
		}
	}
	private static void remove(Stack<String> stack) {
		// TODO Auto-generated method stub
		String poppedElement = stack.pop();
		System.out.println("Popped Element is: " + poppedElement);
	}
	private static void add(Stack<String> stack) {
		// TODO Auto-generated method stub
		Scanner sc1 =  new Scanner(System.in);
		System.out.print("Enter data to push: ");
		String data = sc1.nextLine();
		stack.push(data);
	}
	private static void peek(Stack<String> stack) {
		// TODO Auto-generated method stub
		if(stack.empty())
		{
			System.out.println("Stack is empty!!");
		}else {
			System.out.println("Top element is: " + stack.peek());
		}
		
	}
	private static void print(Stack<String> stack) {
		// TODO Auto-generated method stub
		if(stack.empty())
		{
			System.out.println("Stack is empty!!");
		}else {
			System.out.println(stack);
		}
	}

}
