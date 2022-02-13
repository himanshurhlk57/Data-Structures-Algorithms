import java.util.*;
import java.lang.*;
import java.io.*;

// We already know that we can have functions with the same method name and same parameters in different classes if the 
// classes are independent of each other.
// The base class and derived class can have functions with the same signature.



// Output
// Phone Class
// MobilePhone Class
// Since these classes are independent of each other,
// one class does not care about which methods are there in the other class.

class Phone{
	public void print(){
		System.out.println("Phone Class");
	}
}	

class MobilePhone{
	public void print(){
	System.out.println("MobilePhone Class");
	}
}





// Now, let's say there are 2 classes and both of them are related through inheritance
// Output
// Base Class
// Derived Class
// Here, we are seeing the same behavior as the case when there was no relationship. The function of the respective class is called.
// This is known as function overriding where the function in the base class is being overridden by the one in the derived class.

class Base{
	public void print(){
		System.out.println("Base Class");
	}
}

class DerivedClass extends Base{
	public void print(){
		System.out.println("Derived Class");
	}
}
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception{
		// For first 
	
		
		// Phone phone = new Phone();
		// MobilePhone mobilePhone  = new MobilePhone();
		// phone.print();    // This will print Phone class
		// mobilePhone.print(); //This will print Mobile class
		
		
		
	  // For Second
		
		Base base = new Base();
		DerivedClass derived = new DerivedClass();
		base.print();       // This will print Base class
		derived.print();    // This will print Derived Class
		
		
		
// Only the function with the same signature (name and parameters) will get overridden.
// If the functions in both the class have the same signature but different return types then there will be 
// a compilation error as the compiler would be able to identify that you are trying to override but with a different return type.
// Function overriding in the current form is not polymorphism. Also, the method to be called is resolved during compile-time only.


	}
}