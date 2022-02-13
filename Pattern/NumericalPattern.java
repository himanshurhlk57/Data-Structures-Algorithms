import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech{
	
		
	public static void main (String[] args) throws java.lang.Exception{
		
// Pattern 12
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
		
// 	int row = 5;
// 	int val = 1;
// 	for(int i = 1; i<=row; i++){
// 		for(int j = 1; j<=i; j++){
// 			System.out.print(val + " ");
// 			val++;
// 		}
// 		System.out.println();
// 	}
		
//Pattern 14 -> 
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
		
	// int row = 5;
	// for(int i = 1; i<=row; i++){
	// 	for(int j = 1; j<=i; j++){
	// 		System.out.print(j + " ");
	// 	}
	// 	System.out.println();
	// }
		
// Pattern 15 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
		
// int row = 5;
// for(int i = row; i>=1; i--){
// 	for(int j = 1; j<=i; j++){
// 		System.out.print(j + " ");
// 	}
// 	System.out.println();
// }

//Pattern 16
// 0 
// 1 1 
// 2 3 5 
// 8 13 21 34

	// int row = 4;
	// int a = 0;
	// int b = 1;
	// 	for(int i = 1; i<=row; i++){
	// 		for(int j = 1; j<=i; j++){
	// 			System.out.print(a + " ");
	// 			int c = a+b;
	// 			a=b;
	// 			b=c;
	// 		}
	// 		System.out.println();
	// 	}
		
// Pattern 17
//    1
//   123
//  12345
// 1234567
//  12345
//   123
//    1
		
// 		int n = 7;
// 		int space = n/2;
// 		int star = 1;
// 		for(int i = 1; i<=n; i++){
// 			for(int j = 1; j<=space; j++){
// 				System.out.print(" ");
// 			}
// 			for(int j = 1; j<=star; j++){
// 				System.out.print(j);
// 			}
// 			if(i<=n/2){
// 				space--;
// 				star+=2;
// 				System.out.println();
// 			}else{
// 				space++;
// 				star-=2;
// 			  System.out.println();
// 			}		
// 		}
		
// Pattern 18
//   1
//  222
// 33333
//  444
//   5	
//   
		// int n = 5;
		// int space = n/2;
		// int star = 1;
		// int val = 1;
		// for(int i = 1; i<=n; i++){
		// 	for(int j = 1; j<=space; j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1; j<=star; j++){
		// 		System.out.print(val);
		// 	}
		// 	if(i<=n/2){
		// 		space--;
		// 		star+=2;
		// 		System.out.println();
		// 	}else{
		// 		space++;
		// 		star-=2;
		// 	  System.out.println();
		// 	}	
		// 	val++;
		// }
	
//Pattern 19
//   1
//  222
// 33333
//  222
//   1	
//   	
// 		int n = 5;
// 		int space = n/2;
// 		int star = 1;
// 		int val = 1;
// 		for(int i = 1; i<=n; i++){
// 			for(int j = 1; j<=space; j++){
// 				System.out.print(" ");
// 			}
// 			for(int j = 1; j<=star; j++){
// 				System.out.print(val);
// 			}
// 			if(i<=n/2){
// 				space--;
// 				star+=2;
// 				val++;
// 				System.out.println();
// 			}else{
// 				space++;
// 				star-=2;
// 				val--;
// 			  System.out.println();
// 			}	
// 		}
		
//Pattern 20
//   1
//  234
// 34567
//  234
//   1
		
		
		// int n = 5;
		// int space = n/2;
		// int star = 1;
		// int val = 1;
		// for(int i = 1; i<=n; i++){
		// 	for(int j = 1; j<=space; j++){
		// 		System.out.print(" ");
		// 	}
		// 	int columnVal = val;
		// 	for(int j = 1; j<=star; j++){
		// 		System.out.print(columnVal);
		// 		columnVal++;
		// 	}
		// 	if(i<=n/2){
		// 		space--;
		// 		star+=2;
		// 		val++;
		// 		System.out.println();
		// 	}else{
		// 		space++;
		// 		star-=2;
		// 		val--;
		// 	  System.out.println();
		// 	}	
		// }
		
// Pattern 21
 
		
		int n = 5;
		int space = n/2;
		int star = 1;
		int val = 1;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=space; j++){
				System.out.print(" ");
			}
			int columnVal = val;
			for(int j = 1; j<=star; j++){
				System.out.print(columnVal);
				
				if(j<=star/2){
				columnVal++;
				}else{
				columnVal--;
			}
			}
			if(i<=n/2){
				space--;
				star+=2;
				val++;
				System.out.println();
			}else{
				space++;
				star-=2;
				val--;
			  System.out.println();
			}	
		}
		
		
		}
	}
