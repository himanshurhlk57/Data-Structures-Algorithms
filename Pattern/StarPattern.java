import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech{
	
		
	public static void main (String[] args) throws java.lang.Exception{
		
// Pattern 1 -> Rectangle
// -> * * * * *
//    * * * * *  -> Row - 4, Column - 4;
//    * * * * *
//    * * * * *
		
		// int n = 4; // Row Outer Loop will do work for row
		// int m = 5; // Column Inner Loop will do work for column
		
		// for(int i = 1; i<=n; i++){
		//    for(int j = 1; j<=m; j++){
		//    System.out.print("*" + " ");
		// }
		//  System.out.println();
		// } 
		
// Pattern 2 -> Hollow Rectangle
// -> * * * * *
//    *       *  -> Row - 4, Column - 4;
//    *       *
//    * * * * *
		
// 		for(int i = 1; i<=n; i++){
// 			for(int j = 1; j<=m; j++){
// 				if(i ==1 || j == 1 || i == n || j == m){
// 					System.out.print("*" + " ");
// 				}else{
// 					System.out.print("  ");
// 				}
// 	         }
// 			 System.out.println();
// 			}
		
		
// Pattern 3 -> Half Pyramid
// *
// * *
// * * *
// * * * *
// 
		// int row = 4;
		// for(int i = 1; i<=row; i++){
		// 	for(int j = 1; j<=i; j++){
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		
// Pattern 4 -> Inverted Half Pyramid
// * * * *
// * * *
// * *
// *
		// int row = 4;
		// for(int i = row; i>=1; i--){
		// 	for(int j = 1; j<=i; j++){
		// 		System.out.print("*" + " ");
		// 	}
		// 	System.out.println();
		// }
	
// Pattern 4 -> Inverted Half Pyramid(rotated by 180 deg)
//       *    space = 3, Star = 1
// 	   * *	  space = 2, Star = 2
//   * * *    space = 1, Star = 3
// * * * *    space = 0, Star = 4

		// 1st method;
// 		int row = 4;
// 		int space = row-1;
// 		int star = 1;
// 		for(int i = 1; i<=row; i++){
// 			for(int j = 1; j<=space; j++){
// 				System.out.print(" ");
// 			}
// 			for(int j = 1; j<=star; j++){
// 				System.out.print("*");
// 			}
// 			space--;
// 			star++;
// 			System.out.println();
// 		}
		
		//2nd method
		// int row = 4;
		// for(int i = 1; i<=row; i++){
		// 	for(int j = 1; j<=row-i; j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1; j<=i; j++){
		// 	System.out.print("*");
		// 	}
		// System.out.println();
		//   }
		
//Pattern 5 -> 
// * * * *      star = 4, space = 0;
//   * * *      star = 3, space = 1;
//     * *      star = 2, space = 2;
// 	     *      star = 1, space = 3;
	    
		// int row = 4;
		// int space = 0;
		// int star = row;
		// for(int i = 1; i<=row; i++){
		// 	for(int j = 1; j<=space; j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=1; j<=star; j++){
		// 		System.out.print("*");
		// 	}
		// 	space++;
		// 	star--;
		// 	System.out.println();
		// }

// Pattern 6   // Diamonf
//     *        space 2, star 1, n=5, n/2 = 2 Space has decreased till n/2
//   * * *	    space 1, star 3, after i<=n/2 space increased
// * * * * *    space 0, star 5, in first row there are n/2 space and 
//   * * *      space 1, star 3, 1 star star has increased by 2 till n/2
//     *        space 2, star 1  After n/2 star has increased by 2
		
// 		int n = 7;
// 		int space = n/2;
// 		int star = 1;
// 		for(int i = 1; i<=n; i++){
// 			for(int j = 1; j<=space; j++){
// 				System.out.print(" ");
// 			}
// 			for(int j = 1; j<=star; j++){
// 				System.out.print("*");
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

// Pattern 7          n=5
// * * *   * * *      3* 1Space 3* Space is 1 increasing till n/2 i.e i<=2 
// * *       * *      2* 3Space 2* Star is n/2+1 Decreasing till n/2
// *           *      1* 5Space 1* And increasing after it
// * *       * *      2* 3Space 2* Both space is increasing/decreasing by
// * * *   * * *      3* 1Space 3* 2 and star is decreasing/increasing by
                                   // 1
		// int n = 9;
		// int space = 1;
		// int star = n/2+1;
		// for(int i = 1; i<=n; i++){
		// 	for(int j = 1; j<=star; j++){
		// 		System.out.print("*");
		// 	}
		// 	for(int j = 1; j<=space; j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=1; j<=star; j++){
		// 		System.out.print("*");
		// 	}
		// 	if(i<=n/2){
		// 		space+=2;
		// 		star--;
		// 	}else{
		// 		space-=2;
		// 		star++;
		// 	}
		// 	System.out.println();
		// }
		
// Pattern 8    n=5
// *            0 space 1* 4 space 
//   *          1 space 1* 3 space
// 	   *        2 space 1* 2 space
// 	     *      3 space 1* 1 space
// 	       *    4 space 1* 0 space
// 	       
		// int n=7;
		// int space = 0;
		// int star = 1;
		// for(int i = 1; i<=n; i++){
		// 	for(int j = 1; j<=space; j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1; j<=star; j++){
		// 		System.out.print("*");
		// 	}
		// 		space++;
		// 	  System.out.println();
		// }
		
		// int n=7;                          n=3  1 2 3
		// for(int i = 1; i<=n; i++){           1 * * *
		// 	for(int j = 1; j<=n; j++){          2 * * *
		// 	   if(i==j){                        3 * * *
		// 		   	System.out.print("*");      In this we have to print
		// 	   }else{                           1,1 2,2, 3,3
		// 		   	System.out.print(" ");      i.e when i = j
		// 	   }
		// 	}
		// 	  System.out.println();
		// }

		
// Pattern 9
//         *
// 	     *
//     *
//   *
// *
		// int n=7;
		// int space1 = n-1;
		// int star = 1;
		// int space2 = 0;
		// for(int i = 1; i<=n; i++){
		// 	for(int j = 1; j<=space1; j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1; j<=star; j++){
		// 		System.out.print("*");
		// 	}
		// 	for(int j = 1; j<=space2; j++){
		// 		System.out.print(" ");
		// 	}
		// 	    space1--;
		// 		space2++;
		// 	  System.out.println();
		// }
		
		// int n=7;                          n=3  1 2 3 
		// for(int i = 1; i<=n; i++){          1  * * *
		// 	for(int j = 1; j<=n; j++){         2  * * *
		// 	   if(i+j == n+1){                 3  * * *
		// 		   	System.out.print("*");     we have to print 
		// 	   }else{                          1,3, 2,2, 3,1 i.e i+j = n+1
		// 		   	System.out.print(" ");
		// 	   }
		// 	}
		// 	  System.out.println();
		// }
		
// Pattern 10
// *   *
//  * * 
//   *  
//  * * 
// *   *
		
		// int n=5;
		// for(int i = 1; i<=n; i++){
		// 	for(int j = 1; j<=n; j++){
		// 	   if(i==j || i+j == n+1){
		// 		   	System.out.print("*");
		// 	   }else{
		// 		   	System.out.print(" ");
		// 	   }
		// 	}
		// 	  System.out.println();
		// }
		
//Pattern 11
//   *
//  * *
// *   *
//  * *
//   *		
				
int n = 5;
int space1 = n/2;
int space2 = -1;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=space1; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j<=space2; j++){
				System.out.print(" ");
			}
			if(i>1 && i<n){
			System.out.print("*");
			}
			if(i<=n/2){
				space1--;
				space2+=2;
			}else{
				space1++;
				space2-=2;
			}
			System.out.println();
		}

		
		
		
		}
	}
