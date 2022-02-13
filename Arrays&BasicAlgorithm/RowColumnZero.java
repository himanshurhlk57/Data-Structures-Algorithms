// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

// You must do it in place.
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]



class Solution {
    public void setZeroes(int[][] matrix) {
     
        // create a new matrix copy all the previous matrix element to the new matrix
        // traverse the previous matrix if found 0 at any index make new matrix that row and column to zero.
        
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
				newMatrix[i][j] = matrix[i][j];
			}
		}
        int startRow;
        int startColumn;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                startRow = 0;
                startColumn = 0;
                
                if(matrix[i][j]==0){
                while(startRow<matrix.length){
                    newMatrix[startRow][j] = 0;
                    startRow++;
                }
                while(startColumn<matrix[0].length){
                    newMatrix[i][startColumn] = 0;
                    startColumn++;
                }
              }
            }
        }
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[i][j] = newMatrix[i][j];
            }
        }
        
        
// what i can do here is just traverse the matrix as soon as we find any zero in either row or column we can store that index in set.
// why set because set doesn't contains duplicate. So will create two different stack in one we will keep the index of row where zero found and in other column where zero is found.

// Set contains unique elements only.
// Here, we can store all the row and column indexes of the cells which have 0 in them, in an appropriate container. Later, we can iterate over all elements in the matrix and if the element’s row or column number is found in the set, we can change it to 0.

// Analysis
// Time Complexity: O(row_size * column_size)
// Space Complexity: O(row_size + column_size) 
    // using set or maps.
       
        // Set<Integer> row = new HashSet<>();
        // Set<Integer> column = new HashSet<>();
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         if(matrix[i][j]==0){
        //             row.add(i);
        //             column.add(j);
        //         }
        //     }
        // }
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         if(row.contains(i) || column.contains(j)){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
    }
}