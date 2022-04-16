package com.java.demo.college;

public class Dept {
	int deptId;
	String deptName;
	String deptHod;
	
	// bcoz-->we need pass on args to call this constructor
	
	//by defn -- constructor never returns
			// practically constructor returns ini object cha ref.
	public Dept(int did, String dnm, String dhod) {
		// this --> current object cha ref --> as we dont have name yet--> for 
				// the time being we are referring it as this
		
		this.deptId = did;
		this.deptName = dnm;
		this.deptHod = dhod;
		//return this;
		
	}
	
	// if we add any of the constructor in our class --> compiler never adds default constructor
	
	public static void main(String[] args) {
		
		
		//Def of dept	---> 	=		--> right to left
		Dept dept1 = new Dept(1041,"IT","Mr. AVBCD");	// new mean memory allocate --> 
														// kiti allocate karyche--> defn ahe n 
												//Constructor call karnar -->
		Dept dept2 = new Dept(1201,"ETC","Mr. XABCD");
		Dept dept3 = new Dept(1031,"MECH","Mr. BABCD");
		Dept dept4 = new Dept(1501,"CSE","Mr. TABCD");
		//Dept d = new Dept()								it will give a compile time error
		
		System.out.println(dept1);
		System.out.println(dept2);
		System.out.println(dept3);
		System.out.println(dept4);
		
		
		
		/***
		 * 
		com.java.demo.college.Dept@15db9742
		com.java.demo.college.Dept@6d06d69c
		com.java.demo.college.Dept@7852e922
		com.java.demo.college.Dept@4e25154f

5 object --> 10 properties	--> no of lines of code ?
			15 n

why to write param --> 	
			reduce the num of lines of code --> repd --> param constructor madhe.

		 * 
		 */
	}
	
}
