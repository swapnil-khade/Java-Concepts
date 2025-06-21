package com.java.interfaces;

import java.io.* ;

//By implementing Serializable interface
//we make sure that state of instances of class A
//can be saved in a file.
class Atemp implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1404582311429218667L;			//generated serial version UID
	int i;
	String s;

	// A class constructor
	public Atemp(int i,String s)
	{
		this.i = i;
		this.s = s;
	}
}

public class SerializableInterface
{
	public static void main(String[] args)       throws IOException, ClassNotFoundException
	{
		Atemp a = new Atemp(20,"GeeksForGeeks");

		try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("xyz.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(a);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
		Atemp object1 = null;
  
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream("xyz.txt");
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            object1 = (Atemp)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.i);
            System.out.println("b = " + object1.s);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
	}
}

