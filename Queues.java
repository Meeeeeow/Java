package testjava;
import java.util.*;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
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
					print(queue);
					break;
				case 2:
					peek(queue);
					break;
				case 3:
					add(queue);
					break;
				case 4:
					remove(queue);
					break;
				case 5:
					search(queue);
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
	private static void search(Queue<String> queue) {
		// TODO Auto-generated method stub
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter an element to look up: ");
		String searchedItem = sc3.nextLine();
		for(String item : queue)
		{
			if(item.equals(searchedItem))
				{
					System.out.println("Item is present in the queue!");
					break;
				}
			else
				{
					System.out.println("ITem not found!!");
					break;
				}
		}
	}
	private static void remove(Queue<String> queue) {
		// TODO Auto-generated method stub
		String removedElement = queue.poll(); //remove throws exception when item not removed successfully
		System.out.println("Removed Element is: " + removedElement);
	}
	private static void add(Queue<String> queue) {
		// TODO Auto-generated method stub
		Scanner sc1 =  new Scanner(System.in);
		System.out.print("Enter data to add: ");
		String data = sc1.nextLine();
		queue.offer(data); //add throws exception when item not added successfully
	}
	private static void peek(Queue<String> queue) {
		// TODO Auto-generated method stub
		if(queue.isEmpty())
		{
			System.out.println("Queue is empty!!");
		}else {
			System.out.println("Top element is: " + queue.peek());
		}
		
	}
	private static void print(Queue<String> queue) {
		// TODO Auto-generated method stub
		if(queue.isEmpty())
		{
			System.out.println("Queue is empty!!");
		}else {
			System.out.println(queue);
		}
	}

}
