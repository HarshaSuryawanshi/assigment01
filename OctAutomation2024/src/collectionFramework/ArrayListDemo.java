package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		
		//Adding Data into ArrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Simon");
		mylist.add(null);
		mylist.add('A');
		mylist.add(100);
		mylist.add(true);
		
		//Size of Arraylist
		System.out.println(mylist.size());

	}

}
