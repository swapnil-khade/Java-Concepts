package com.java.designPattern;

class DemoEager{
	private static DemoEager obj;
	
	static {
		obj= new DemoEager();
	}
	
	private DemoEager() {									// To restrict object creation outside class.
		
	}
	
	public static DemoEager getInstance() {
		
		return obj;
	}
}

class DemoLazy{
	private static DemoLazy obj;
	
	private DemoLazy() {
		
	}
	
	public static DemoLazy getInstance() {

		if(obj==null) {
			synchronized(DemoLazy.class) {
				if(obj==null) {
					obj = new DemoLazy();
				}
			}
		}
		
		
		return obj;
	}
}

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoEager x = DemoEager.getInstance();
		DemoEager y = DemoEager.getInstance();
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		System.out.println("-----------------------");
		
		DemoLazy a = DemoLazy.getInstance();
		DemoLazy b = DemoLazy.getInstance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
