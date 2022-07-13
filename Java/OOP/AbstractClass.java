
import java.util.*;
import java.lang.*;
import java.io.*;

// Abstract method 

// Abstract functions are functions which have no implementation and should
// always be implemented by the derived classes. Exception: If the derived class
// is also an abstract class then the abstract class can avoid implementing the
// function and in that case the function needs to be implemented by a derived
// class of that abstract class unless of course it is abstract as well.

//  Any class which have one or more method as abstract then the class should be declared as abstract
//  We can't create object of abstract class if you want to create then you have to implement the methods of abstract class
//  while you are creating its object i.e plz override it

// Abstract class can contain static method becuase we can call that method through the class name no need to create object
//  for that also as we know we cant create object of abstract class
// also it can contain default method;

// you can't create abstract static method and abstract constructor  in abstract class 
// you can't have final abstract class 
// multiple inheritance is still not allowed using abstract class a son class can't extent to parent class at a time

// public class Son extends Parent, Parent2{ // not allowed

// }

abstract class Parent {

	abstract void career();

	abstract void partner();
 
	int age;

	static void hello() {
		System.out.println("static method");
	}

}

// Parent class contains an abstract method then every child class has to
// override the parent class

// extends parent because the method in the parent class doesn't have any
// body.
// So Son must either be declared abstract or implement abstract method carrer
// in Parent.
// There is 2 abstract method in Parent implement both the method in child class

class Son extends Parent {

	Son(int age) {
		this.age = age;
	}

	// @Override
	void career() {
		System.out.println("I am going to be a software engineer");
	}

	// @Override
	void partner() {
		System.out.println("I Love Katherine");
	}
}

class WorkAtTech {
	public static void main(String[] args) throws java.lang.Exception {
		Son son = new Son(39);
		son.career();
		son.partner();
		System.out.println(son.age);

		Parent.hello();
	}
}

You can't create object of abstract class because if we try to 
call abstract method of abstract class as abstract method doesn't have 
body it will throw error 



// Parent class will have some abstract method class would have to be declared
// abstract all the child class should override/implement
// the parent class abstract method becuase parent class method does not have
// body so either implement the method or declare the child
// class as abstract too.
// If you definitely know the parent class method is going to be overridden make
// those method as abstract also it looks clear.

// These types of classes where the only purpose of the class is to provide
// abstraction to the derived classes are known as abstract classes.


// @workAtTech
//
// Syntax

// abstract class ClassName {
// .
// .
// }

// Base class method

// void move() {
// }

// Doing this will not ensure that the derived classes override this method. To
// enforce derived classes to override certain methods of the base class, we can
// make those methods in the base class as abstract.


// abstract class ClassName {
// .
// .
// .
// public abstract void move();
// }

// Here, move is a abstract function and the Animal class is an abstract class.
// Now, if we try to create an object of Animal class, we would get an error
// because the function move won't be defined.

// Note that if we set any function as abstract then it is mandatory to make
// that class abstract as well. Also, not all methods of an abstract class needs
// to be abstract. Only those methods that do not need a base implementation and
// should be overridden needs to be abstract.

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// abstract class Animal {
// public void eat(String food) {
// System.out.print("Eating " + food);
// }

// public abstract void move();
// }

// class Human extends Animal {
// public void move() {
// System.out.print("Walk");
// }
// }

// class Snake extends Animal {
// public void move() {
// System.out.print("Crawl");
// }
// }

// class Eagle extends Animal {
// public void move() {
// System.out.print("Fly");
// }
// }

// class WorkAtTech
// {
// public static void main (String[] args) throws java.lang.Exception
// {
// Note that we cannot create Animal objects now as Animal is an abstract class
// The following code will give error if uncommented.
// Task: Uncomment the next line, run and see the error. Comment again after
// that.
// Animal animal = new Animal();

// Human human_1 = new Human();
// Snake snake_1 = new Snake();
// Eagle eagle_1 = new Eagle();
// Human human_2 = new Human();
// Eagle eagle_2 = new Eagle();

// Creating an array of Animal
// Animal[] animals = new Animal[5];

// Assigned human_1 and eagle_1 to 0th and 1st index of animals
// animals[0] = human_1;
// animals[1] = snake_1;
// Task: Assign eagle_1, human_2 and eagle_2 to 2nd, 3rd and 4th index of
// animals
// animals[2] = eagle_1;
// animals[3] = human_2;
// animals[4] = eagle_2;

// Task: Hit run and see what gets printed and if it is what you expected
// for (int i = 0; i < 5; i++) {
// animals[i].move();
// System.out.println();
// }
// }
// }