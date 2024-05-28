package mouri.project.com;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		list.add(107);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(4));
		
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		list.remove(1);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	
	}
	
}
