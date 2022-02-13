import java.util.*;
import java.lang.*;
import java.io.*;

// Similar to abstract classes, there is something known as interfaces. An interface can be thought of as an abstract class 
// with all methods as abstract (except default and static methods). A class or interface can implement another interface.

// Interfaces are pretty commonly used to achieve abstraction.

interface Animal {
    void move();
    void speak();
    void eat();
}

class Dog implements Animal {
    public void move() {
        System.out.println("Walk");
    }
    
    public void speak() {
        System.out.println("Bark");
    }
    
    public void eat() {
        System.out.println("Eat");
    }
    
    //Note that a class can have more methods than the interface
    public void sleep() {
        System.out.println("Sleep");
    }
}


// Every abstract method in the interface needs to be implemented by the class implementing the interface. 
// Exception: The class being abstract in which case, the class extending the abstract class needs to implement it.

// An interface can extend multiple interfaces. A class can implement multiple interfaces. 
// This allows doing multiple inheritance in Java which is not possible with base classes









// Multiple inheritance is not supported due to ambiguity
// if parent and partner1 both contain the same function then the child class son will get confused which function to pick up

//  

// This is not supported in java for this we have to learn interfaces

// class Son extends Parent, Parent1{
	
// }

// Interfaces are basically extension of abstract class 
// 
// It is basically a class with all its function as abstract by default all the methods are abstract you dont have to write specifically.
// Variable in interfaces as final and static because it doesn't dependent on object.
// Variable declared in the interfaces are default final because interfaces cant have constructor then how you are going to initialize that 
// and final variable always need to be initialized.
// Java interfaces can be implemeted using implements keyword the main point is you can multiple interfaces together.


 interface Engine{
	// int price = 780000;  //By default static and final
	// static final int price = 780000; no need to write in this way
	void start();
	void stop();
	void acc();
}

 interface Brake{
	void brake();
	// void start();
}

 interface Media{
	void start();
	void stop();
}


// ABstract methods start, stop so implement all the method
class Car implements Engine, Brake{
	void brake(){
		System.out.println("I brake like a normal car");
	}
	void start(){
		System.out.println("I start like a normal car");
	}
	void stop(){
		System.out.println("I stop like a normal car");
	}
	void acc(){
		System.out.println("I acc like a normal car");
	}
}

// Now its donot matter which method i want to inherit because all the interfaces has its own abstract methods all are 
// providing the body for it so it doesn't matter which one is it overriding 
// Now the conflicts problem is resolved
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Car car = new Car();
		car.acc();
		car.start();
		car.stop();
	}
}