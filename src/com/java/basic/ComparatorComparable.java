package com.java.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class Laptop implements Comparable<Laptop>{
	int ram;
	int storageCapacity;
	String Brand;
	public Laptop(int ram, int storageCapacity, String brand) {
		super();
		this.ram = ram;
		this.storageCapacity = storageCapacity;
		Brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return " Laptop [ram=" + ram + ", storageCapacity=" + storageCapacity + ", Brand=" + Brand + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		
		//return this.Brand.compareTo(o.Brand);
		//return this.Brand.compareToIgnoreCase(o.Brand);
		return this.ram-o.ram;
	}
	
	
}

public class ComparatorComparable {

	public static void main(String[] args) {
		List<Laptop> laptops= new ArrayList<Laptop>();
		laptops.add(new Laptop(8, 512, "Sony"));
		laptops.add(new Laptop(4, 1024, "HP"));
		laptops.add(new Laptop(16, 512, "Lenovo"));
		laptops.add(new Laptop(2, 2048, "Dell"));
		
		Collections.sort(laptops);											// Using Comparable
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
		
		System.out.println("-----------------------------------------------");

		Collections.sort(laptops, new Comparator<Laptop>(){					// Using Comparator	

			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o2.Brand.compareTo(o1.Brand);
			}
			
		});
		
		//laptops.forEach(i->System.out.println(i));
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

		System.out.println("-----------------------------------------------"); // Using Comparator + Java 8	
		
		Collections.sort(laptops, (o1,o2) -> o1.storageCapacity-o2.storageCapacity);	
		
		laptops.sort((o1,o2) -> o1.storageCapacity-o2.storageCapacity);
		
		Function<Laptop, Integer> f = new Function<Laptop, Integer>() {
			
			@Override
			public Integer apply(Laptop t) {
				return t.getRam();
			}
		};
		laptops.sort(Comparator.comparing(f)); 
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

		System.out.println("-----------------------------------------------");
		laptops.sort(Comparator.comparing(laps->laps.getBrand())); 
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

		System.out.println("-----------------------------------------------");
		laptops.sort(Comparator.comparing(Laptop::getRam));     // takes object of Function
		
		
	}

}
