package testjava;
import java.util.*;
//import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of items: ");
		int length = sc.nextInt();
		System.out.println();
		int arr[] = new int[length];
		for(int i=0; i < length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(arr.length);
		System.out.println(arr);
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int item : arr)
		{
			System.out.println(item);
		}
		
		//2D array
		int arr2D[][] = {{1, 2, 3} , {4, 5, 6}};
		for(int i=0;i< arr2D.length;i++)
		{
			for(int j = 0;j<arr2D[i].length;j++)
			{
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}
		
		//ArrayList
		String input = "";
		boolean check = true;
		int counter = 0;
		String arrStr[] = new String[5]; 
		try (Scanner sc1 = new Scanner(System.in)) {
			while(check)
			{
				input = sc1.nextLine();
				arrStr[counter] = input;
				System.out.println("Input is: " + input);
				counter++;
				if(counter >= 5)
					check = false;
				System.out.println(arrStr.length);
			}
		}
		System.out.println(arrStr.length);
		System.out.println("Items are: ");
		for(String lines : arrStr)
		{
			System.out.println(lines);
		}
		
		List<Integer> arrayList = new ArrayList<>(5);
		for(int i=0;i<6;i++)
		{
			arrayList.add(i);
		}
		System.out.println(arrayList);
		arrayList.add(8);
		System.out.println(arrayList);
		arrayList.set(0,21);
		System.out.println(arrayList);
		arrayList.remove(4);
		System.out.println(arrayList);
		for(int item : arrayList)
		{
			System.out.println(item);
		}
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		//linkedlist
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		System.out.println(linkedList);
		linkedList.addFirst("C");
		System.out.println(linkedList);
		linkedList.addLast("G");
		for(String letter : linkedList)
		{
			System.out.println(letter);
		}
		System.out.println(linkedList.getFirst());
		
		linkedList.remove(1);
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.removeLast();
		for(int i= 0; i<linkedList.size();i++)
		{
			System.out.print(linkedList.get(i));
		}
		//hashset
		System.out.println();
		Set<Integer>hashSet = new HashSet<Integer>();
		for(int i = 0;i < 6;i++)
		{
			hashSet.add(i * 2);
		}
		System.out.println(hashSet);
		System.out.println(hashSet.add(6));
		if(hashSet.contains(10))
		{
			System.out.println("10 is present!");
			hashSet.remove(10);
		}
		for(int item : hashSet)
		{
			System.out.println(item);
		}
		//treeset --> natural order maintains
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("A");
		System.out.println(treeSet);
		treeSet.remove("B");
		
	}

}
