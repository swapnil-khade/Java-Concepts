package com.java;

import java.util.Date;

public class JavaImmutableClasses {
		public static void main(String[] args) throws CloneNotSupportedException {
			Student1 st1 = new Student1(101,"AAAAA",new Address("Pune", "MH"));
			Student1 st2 = (Student1) st1.clone();
			
			st2.getStudAddress().setCity("Mumbai");
			
			System.out.println(st1);
			System.out.println(st2);
			
			System.exit(0);
			
			//JavaImmutableClasses jc1 = new JavaImmutableClasses();
			//JavaImmutableClasses jc2 = jc1.clone();
			
			
			
			System.exit(0);
			Emp e1 = new Emp(101, "AAAAA", new Date(2011,10, 13), new Address("Pune", "MH")); // e1-- pune
			System.out.println(e1);
			e1.getAddress().setCity("Mumbai"); // new address madhe --> pune --> mumbai-->
			e1.getDateOfJoining().setDate(23); // new date instance  --> e1 --. instance would be as it is...
			System.out.println(e1);
		}
}

//Emp class --> Immutable  ==? once emp object is created --> no value should be changed.
final class Emp{
	final private int empId;
	final private String empName;
	final private Date dateOfJoining;
	final private Address address;
	
	public Emp(int empId, String empName, Date dateOfJoining, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", dateOfJoining=" + dateOfJoining + ", address="
				+ address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Date getDateOfJoining() {
		Date dt = new Date(dateOfJoining.getYear(),dateOfJoining.getMonth(),dateOfJoining.getDay());
		return dt;
	}
	public Address getAddress() {
		Address adr = new Address(address.getCity(),address.getState()); // new Address instance with existing values
		return adr;	// new address instance kela
	}
	
}

class Address implements Cloneable{
	private String city;
	private String state;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}


/**
		Changes in other class [Address] --> allowed
					Yes -->
					No -- create new instance with copied and then return --> same field --> getter madhe.
					
					
	to make a class as immutable --> what are the steps..
	
	
	make class as final --> so no one can inherite/extend 
		all fields --> private + final
		remove all setters
		in case any other ref -->
				mutable ---> changes allowed-->
									Yes : same changes tya class madhe
									No  : new instance in a getter with copied value and return new instance instead org one
				immutable/systemdefined
						No  : new instance in a getter with copied value and return new instance instead org one
						
	Why do we need immutable classes ??????
			immutable --> thread safe --> testing easy ast-->
			
	

	getclass		--> fullyqualified classname 
	tostring		--> object representation 
	clone
	hashcode		--> memory address -> integer representation
	finalize		---> just before gc --> any activity to be performed finalized method madhe
	
	
	protected --> finalized/clone			--> this method can be called in same package anywhere--but in other
					--> package-- only child/subclass/derive-- can call
	
	native  --> hashcode/clone	--> platform specific implementation
				[Low Level Task]
				
				memory --> address allocation --> os -->
				clone --> memory to memory copy --> os
	Windows -->
	Linux
	
Threading- Topic -->	wait/notify
	wait--  wait()		wait(ms)   wait(ms,ns)
	notify ---> notify   notifyall


\*/

class Student1 implements Cloneable{
	private int studId;
	private String studName;
	private Address studAddress;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student1 clonnedSt = (Student1) super.clone();					//student la 
		Address clonnedAdr = (Address)clonnedSt.studAddress.clone();		//address la pn   
		clonnedSt.setStudAddress(clonnedAdr);
		return clonnedSt;
		//return super.clone();					// otherwise Address chi shallow copy create hoil
	}
	
	
	@Override
	public String toString() {
		return "Student1 [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}


	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Address getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}

	public Student1(int studId, String studName, Address studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
	}

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	
}