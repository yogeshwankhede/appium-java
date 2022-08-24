package org.tyss.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import org.testng.annotations.Test;

public class JavaListOperations {
	@Test
	public <T> void addDataToList() {

		ArrayList<Object> list = new ArrayList<>();

		list.add(10);
		list.add('A');
		list.add("Hello");
		list.add(10);
		//System.out.println(verify);
		System.out.println(list);
		list.add(2, "insertedData");

		System.out.println(list);
		boolean check = list.contains("Hello");
		if(check==false) 
			System.out.println("Data is not present");
		else
			System.out.println("Data is present");
		ArrayList<Object> newList = new ArrayList<>();
		newList.add("bond007");
		newList.add(8888);
		list.addAll(newList);
		System.out.println(list);
		ArrayList<Object> indexList = new ArrayList<>();
		indexList.add("insertedStart");
		list.addAll(3, indexList);

		System.out.println(list);

		int index = list.indexOf("Hello");

		System.out.println("Hello is at "+index+"th position");


		newList.add(67);
		newList.add(44);
		newList.add(98);
		newList.add(23);


		list.addAll(newList);

		ArrayList<Integer> intList= new ArrayList<>();
		intList.add(89);
		intList.add(65);
		intList.add(33);
		intList.add(11);
		intList.add(33);
		
		Collections.sort(intList);
		Collections.reverse(intList);
		
		
		System.out.println();
		list.addAll(intList);
		list.removeAll(indexList);
		System.out.println(list);
		
		list.retainAll(intList);
		System.out.println(list);
		
		boolean match = list.equals(intList);
		System.out.println(match);
		System.out.println(list.get(3));
		System.out.print("==================================Vector==============================================");
	}
	@Test
	public void VectorOperations() {
		Vector<String> vec = new Vector<>();
		
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		
		//check size
		System.out.println("Size is "+vec.size());
		System.out.println("capacity is "+ vec.capacity());
		
		
		System.out.println(vec);
		
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		//check size
		System.out.println("Size is "+vec.size());
		System.out.println("capacity is "+ vec.capacity());
		if(vec.contains("Tiger")) {
			System.out.println("data is present"+vec.indexOf("Tiger"));
		}
		else
			System.out.println("data is not present");
		System.out.println("first data in vector is "+ vec.firstElement());
		System.out.println("last data in vector is "+ vec.lastElement());
		
		System.identityHashCode(vec);
		
		Vector<Object> vector = new Vector<>();
		System.out.println("=============vector enumeration============");
		vector.add(32);
		vector.add(12);
		vector.add(55);
		vector.add(87);
		@SuppressWarnings("rawtypes")
		Enumeration e = vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
	}

}
