package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class StartApp {
		
	public static void main(String[] args) {
		
		
		List<Integer> v1 = new ArrayList<Integer>();
		v1.add(10);
		v1.add(34);
		v1.add(34);
		
		System.out.println(v1);
		    //entire collection is depenedent on generics -->
			// generics never allowes to place primitives...
		System.exit(0);
		
		NewBox<Integer,Integer> box1 = new NewBox<Integer,Integer>(10, 29);
		NewBox<String,String> box2 = new NewBox<String,String>("V1","V2");
		NewBox<String,Integer> box3 = new NewBox<String,Integer>("V1",23);
		
			
		
	}
}

//generic --> 1.5 --> to make statically typed of programming lang as dynamically typed..
class NewBox<T1,T2>{
	T1 v1;
	T2 v2;
	public T1 getV1() {
		return v1;
	}
	public void setV1(T1 v1) {
		this.v1 = v1;
	}
	public T2 getV2() {
		return v2;
	}
	public void setV2(T2 v2) {
		this.v2 = v2;
	}
	@Override
	public String toString() {
		return "NewBox [v1=" + v1 + ", v2=" + v2 + "]";
	}
	public NewBox() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewBox(T1 v1, T2 v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}
}