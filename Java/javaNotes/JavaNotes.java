
How java code executes 


//  .java file         compiler      .class file   interpreter        Machine Code 
//  (human readable)   (entire file)  (byte code)  (line by line)     (0 1 0 1)

In java we get bytecode that can run on all operating system. Java is a platform-independent but JVM is platform 
dependent
Whereas in C/C++ after compilation we get .exe file which is platform dependent

Apart from primitive data types, we have reference data types. 
These are data types that can be used to create reference variables.
 Any class either in-built or user-defined is a reference data type.

1 -> // Static keyboard

static int x;
static void function(){

}
static method/function can be called by without creating object of its class, whereas instance member function can only 
be called by creating object of it class. 

2 -> // main 
main() in java is the entry point for any Java program, name of the method which is searched by JVM as a starting point.

main method is static so that JVM should not create object of that class to call main method.

3 -> // Not 100% object-oriented

Java is not 100% objects-oriented programming language because it makes use of eight primitive data types 
such as boolean, byte, char, int, float, double, long, short which are not objects.

4 -> // Wrapper class
provides a way to use primitive data types (int, boolean, etc) as objects.
Sometimes you must use Wrapper classes when working with collectiom objects such as ArrayList. The list can only store object. 

ArrayList<int> list = new ArrayList<int>(); // invalid
ArrayLis<Integer> list = new ArrayList<Integer>(); //valid

for every primitive value we have wrapper classes for it. 
int -> Integer 
float -> Float

5 -> // package in java
package in java are the collection of related classes and interface which are bundled together 



