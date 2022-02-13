// You are given a 2-D matrix surface of size n*m. Each cell of the surface is either 1 (land) or 0 (water).
// Find the number of islands on the surface.

        //       North
        //        ^
        // West   |       East
               
        //      South
               
/* Graph given in the form of 2D grid every cell is an vertex of graph
Every cell in the 2d array is connected to its north east west south vertex
that's why we call it as virtual graph

surface: [
 [1, 1, 0, 1]
 [1, 0, 1, 1]
 [0, 1, 0, 1]
]
Num islands: 3

                     (x-1, y) 
                        ^
                        |
        (x, y-1)  <-  (x,y) -> (x, y+1)
                        |
                       x+1, y
*/
         
// code using visited array 
class Solution {
	
	static boolean isValid(int[][] surface, int i, int j){
		return (i>=0 && i<surface.length && j>=0 && j<surface[0].length && surface[i][j] == 1);
	}
	
	public static void dfsTraversal(int[][] surface, int i, int j, boolean[][] visited){
		
			if(isValid(surface, i+1, j) && !visited[i+1][j]){
			  dfsTraversal(surface, i+1, j, visited);
			}
            if(isValid(surface, i-1, j) && !visited[i-1][j]){
				dfsTraversal(surface, i-1, j, visited);
			}
			if(isValid(surface, i, j+1) && !visited[i][j+1]){
			dfsTraversal(surface, i, j+1, visited);
			}
		    if(isValid(surface, i, j-1) && !visited[i][j-1]){
				dfsTraversal(surface, i, j-1, visited);
			}

	}
	
	
	int getNumberOfIslands(int[][] surface){
		boolean[][] visited = new boolean[surface.length][surface[0].length];
    	int answer = 0;
		for(int i = 0; i<surface.length; i++){
			for(int j = 0; j<surface[0].length; j++){
				if(!visited[i][j] && surface[i][j] == 1){
					answer++;
					dfsTraversal(surface, i, j, visited);
				}
			}
		}
		return answer;
	}
}




// without using visited array after counting num of island mark
// the visited cell 0 so that we don't need to care about it if we visit 
// it in future.


class Solution {
	
	public static void dfsTraversal(int[][] surface, int i, int j){
		if(i>=0 && i<surface.length && j>=0 && j<surface[0].length && surface[i][j] == 1){
			surface[i][j] = 0;
			dfsTraversal(surface, i+1, j);
			dfsTraversal(surface, i-1, j);
			dfsTraversal(surface, i, j+1);
			dfsTraversal(surface, i, j-1);
		}
	}
	
	
	int getNumberOfIslands(int[][] surface) {
    	int answer = 0;
		for(int i = 0; i<surface.length; i++){
			for(int j = 0; j<surface[0].length; j++){
				if(surface[i][j] == 1){
					dfsTraversal(surface, i, j);
					answer++;
				}
			}
		}
		return answer;
	}
}