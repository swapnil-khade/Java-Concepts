package com.java.javaprograms;

public class PalindromeExample {

	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 454; 

		temp = n;
		while(temp>0) {
			r = temp%10;
			sum = sum*10+r;
			temp = temp/10;
		}
		if (n == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
		
		System.out.println("-----------------------------------");
		
		String s="ababa";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s.equals(s1))
			System.out.println("Palindrome String");
	}

}
