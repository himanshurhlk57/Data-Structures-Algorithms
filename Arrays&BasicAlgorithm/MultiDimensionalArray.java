import java.util.*;
import java.lang.*;
import java.io.*;

/* arr[1][2] - 1st row, 2nd column  By default values are initialized to zero.
 * 
 */
class WorkAtTech {
	public static void main (String[] args) throws java.lang.Exception{
	
		// int[][] arr2D = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
		// System.out.println(arr2D.length); // No of rows -> 3
		// System.out.println(arr2D[0].length); // No of columns -> 4
		
		
		
		int[][] arr = {{1,2}, {3,4}};    //1 2
		                                 //3 4
		System.out.println(arr[0][0] + arr[1][1]);
		
		
		
		// Input format Number of rows(2) -> No of columns(2) -> first row data(1 2) -> second row data(3 4) 
		// Output -> 
		//           1 2
		//           3 4 
		          
// 		Scanner scn = new Scanner(System.in);
// 		int rows = scn.nextInt();
// 		int columns = scn.nextInt();
// 		int[][] arrTwo2D = new int[rows][columns];
// 		for(int i = 0; i<arrTwo2D.length; i++){
// 			for(int j = 0; j<arrTwo2D[0].length; j++){
// 				arrTwo2D[i][j] = scn.nextInt();
// 			}
// 		}
// 		for(int i = 0; i<arrTwo2D.length; i++){
// 			for(int j = 0; j<arrTwo2D[0].length; j++){
// 		System.out.println("arr[" + i + "][" + j + "] = " + arrTwo2D[i][j]);
// 			}
// 		}
// 		System.out.println();
		
		
		//Copy element from old matrix to new matrix
		int[][] matrix = {{1,2}, {3,4}};
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
				newMatrix[i][j] = matrix[i][j];
			}
		}
		for(int i = 0; i<newMatrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
				System.out.println("arr[" + i + "][" + j + "] = " + newMatrix[i][j]);
			}
		}
		System.out.println();
		
		
		
		
	}
}