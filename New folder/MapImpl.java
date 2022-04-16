package com.java;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class MapImpl {
	
	public static void main(String[] args) throws InterruptedException {
		
		//whenever key becomes weak --> automatically that entry[key,value]
			// will be removed from --> hashtable [ds] = hashmap and weakhashmap ka bh
		
		
		Book b1 = new Book(101, "AAA1", 222, 128.34);
		Book b2 = new Book(101, "AAA2", 122, 128.34);
		HashMap<Book,String> hmap =new HashMap<Book, String>();
		hmap.put(b1, "A1");	//null		[B1 A1]
		hmap.put(b2,"A2");	//A1		[B1 A2]
		
		Book b5 = new Book(1012, "BAAA", 322, 128.34);
		Book b6 = new Book(1012, "CAAA", 422, 128.34);
		IdentityHashMap<Book, String> imap = new IdentityHashMap<Book, String>();
		imap.put(b5, "X1");	//HASHCODE AND EQUALS
		imap.put(b6,"X2");	// HASHTABLE ??
				//HASHCODE --> System.identityHashCode()
				// equals  --> ref equality		--> never performs contentn equality
		System.out.println(hmap.size() +" Size --> Hashmap"); //1 -->b1 --> a2
		System.out.println(imap.size()+" Size --> IdentityHashMap");	//2
		
		
		System.out.println(hmap);
		System.out.println(imap);
		
		System.exit(0);
		
		
		
		System.out.println("---------------------------------------");
		Book b3 = new Book(1012, "BAAA", 322, 128.34);
		Book b4 = new Book(1013, "CAAA", 422, 128.34);
		WeakHashMap<Book,String> whmap = new WeakHashMap<Book, String>();
		whmap.put(b3, "X1");
		whmap.put(b4,"X2");
		
		
		System.out.println(hmap.size() +" Size --> Hashmap");
		System.out.println(whmap.size()+" Size --> WeakHashmap");
		
		
		b2 = null;	// key from hashmap --> is null now
		b4 = null;	// key from whahsmp --> is also null

		System.out.println("----------------------------------");
		System.out.println(hmap.size() +" Size --> Hashmap");
		System.out.println(whmap.size()+" Size --> WeakHashmap");
		
		System.gc(); // it's just a trigger to the gc --> it's not a gurrented ops
		for(int i=0;i<10;i++) {
			System.out.println("----------------------------------");
			System.out.println(hmap.size() +" Size --> Hashmap");
			System.out.println(whmap.size()+" Size --> WeakHashmap");
			TimeUnit.MILLISECONDS.sleep(10);
		}
		
		
		
		System.exit(0);
		
		//WeakHashMap
		//identityHashMap
		
		//properties dict hashtable 
		
		
		
		
	}
}

// map --> Hashmap -- LinkedHashMap --> TreeMap --->
	