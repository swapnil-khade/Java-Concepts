package com.java.basic;

import java.util.Arrays;

class CustomException extends Exception {
	public CustomException() {}
    public CustomException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
	@Override
	public String toString() {
		return "CustomException";
	}
    
    
}
 
// A Class that uses above MyException
public class MyException {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new CustomException();
        }
        catch (CustomException ex) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.toString());
        }
    }
}
