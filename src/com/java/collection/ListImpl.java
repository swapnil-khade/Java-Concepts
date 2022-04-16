package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ListImpl {

		public static void main(String[] args) {
		
		int array[] = new int[0];										// Array
		array=Arrays.copyOf(array, array.length+1);
		array[0]=12;
		
		Collection v2 = new ArrayList(); 								// Collection does not work with index.
		Collection<Integer> v1 = new ArrayList<>();
		
		 
		ArrayList<Integer> valuesx = new ArrayList<Integer>();			//ArrayList internally uses Array		good for read operations
		valuesx.add(712);
		valuesx.add(128);
		valuesx.ensureCapacity(200);									//min capacity
		System.out.println("size: of x "+valuesx.size());
		
		ArrayList<Integer> valuesy = new ArrayList<Integer>();		
		valuesy.add(12);
		valuesy.add(124);
		
		valuesy.add(12);
		
		//valuesy.trimToSize();
		System.out.println("size of y: "+valuesy.size());
		valuesy.add(122);
	
		//valuesy.remove(12);											// error -> there is no  12 index
		valuesy.remove(new Integer(12)); 								// will remove the 12		// first matching remove..
		 							
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(12);
		valuesy.removeAll(v);											// remove all matching 12s 
		
		
		valuesy.set(1, 1111);											// replace value 
		int x = valuesy.get(1);											// retrieve on the basis of index 
																		//add --> append ----> 
																		//add(index,element) --> insert in between
																		//remove(index)--> index 
																		//remove(object) --> element
		valuesy.add(1, 420);
		
		
		
		System.out.println("Value of  x "+x);
		System.out.println("Valuex "+valuesx);
		System.out.println("ValuesY"+valuesy);
		
		
		valuesx.addAll(valuesy);										// valuey all elements --> valuex
		
		System.out.println("After addall -->");
		System.out.println(valuesx);
		
		//System.exit(0);
		
		
		
		
		System.out.println(valuesx.contains(12));
		System.out.println(valuesx.isEmpty()); 
		System.out.println(valuesx.add(34));
		valuesx.add(null);		
		valuesx.add(null); 
		System.out.println(valuesx);
		 
		
		ArrayList<Integer> values2 = new ArrayList<Integer>();		//10		---> 10 15 22 33
			
		ArrayList<Integer> values3 = new ArrayList<Integer>(25);		//25	--> 25 -->37 ---> 
		values3.add(120);
		values3.add(233);
		values3.add(2333); // 3
		
		ArrayList<Integer> values4 = new ArrayList<Integer>(values3);	//value3.size()	--> 0---> 3	--> 4 --> 6--
		
		
	/**
	 * Array 																		 
	 * 		fixed in size 																	Dynamic in nature--
	 * 		cannot grow at runtime															Arrays.copy(older,newleng)
	 * 		only homogeneous data elements are allowed										Hom+htro --> Arraylist-- Array -- Object type
	 * 		primitives + objects area allowed												only objects
	 * 		size required in advanced..														Yes* --> 10 size
	 * 		index based mechanism to retrieve the data	--> as continious memory location
	 * 
	 * 
	 * 
	 * 
	 * <1.7 ---> cp * 3/2 + 1			--> 16
	 * >=1.7 --> cp+cp>>1				--> 10+5	--> 22 --> 33	
	 * 
	 */		
	}
}