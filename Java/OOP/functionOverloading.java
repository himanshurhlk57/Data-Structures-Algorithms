import java.util.*;
import java.lang.*;
import java.io.*;

Polymorphism means having many forms(Poly: Many, Morph: form)
Polymorphism refers to the same object exhibiting different forms and behaviors


// Function Overloading 

// Function overloading is the ability to create multiple functions with the same name but different implementations.
// This type of polymorphism is known as compile time polymorphism
// What basically happens here is that when the code is getting compiled, the compiler tries to select the correct method 
// for each of function calls based on the arguments being passed (number of arguments and data types of those arguments).

class WorkAtTech
{
	public static int maxSum(int number1, int number2){
		if(number1>number2){
			return number1;
		}
		return number2;
	}
	
	public static double maxSum(double number1, double number2){
		if(number1>number2){
			return number1;
		}
		return number2;
	}
	
		public static int maxSum(int number1, int number2, int number3){
		if(number1>number2 && number1>number3){
			return number1;
		}
		if(number2>number1 && number2>number3){
			return number2;
		}
			return number3;
	}
	
		public static double maxSum(double number1, double number2, double number3){
		if(number1>number2 && number1>number3){
			return number1;
		}
		if(number2>number1 && number2>number3){
			return number2;
		}
			return number3;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int maxOfTwoNumber = maxSum(2,3);
		double maxOfTwoDecimalNumber = maxSum(23.04, 24.06);
		int maxOfThreeNumber = maxSum(2,3,4);
		double maxOfThreeDecimalNumber = maxSum(2.5,3.6,4.6);
		System.out.println(maxOfTwoNumber);
		System.out.println(maxOfTwoDecimalNumber);
		System.out.println(maxOfThreeNumber);
		System.out.println(maxOfThreeDecimalNumber);
	}
}


// int divide (int numerator, int denominator) {
// 	return numerator/denominator;
// }
// float divide (int numerator, int denominator) {
// 	return numerator/((float) denominator);
// }
// Here, even though the implementation and return type is different, the number of parameters and the data types are still the same. 
// That's why it is not valid. Function Overloading allows us to create functions with the same name with different parameters only.