// Adjacency List is an array of lists with each array index denoting the node and the 
// value at that index denoting the list of nodes adjacent to it. Unlike adjacency matrix, 
// adjacency list stores only the edges in the data structure.

// Adjacency Matrix is a 2D array of size V*V where V denotes the number of vertices.
//  Every cell adj[[i][j] denotes whether there is an edge from i to j. In case of 
//  undirected graphs, the matrix wil be symmetric (adj[i][j] and adj[j][i] would always be equal for any i, j).

// Adjacency Matrix is also used to represent the edge weight by assigning the weight w to 
// adj[i][j].




0 node of graph is keeping the node to which it is connected to and so 1 , 2 , 3

0 - 1 2 3
1 - 0       (adjacency list)
2 - 0 3
3 - 0 2


   0  1  2  3
0  0  1  1  1
1  1  0  0  0  (adjacency matrix)
2  1  0  0  1
3  1  0  1  0

Convert given list to matrix
 first go to the first index of the array and then traverse in that list
 if somehow we can get i and j index at which we have to put 1 then our
 work is done
 matrix[i][j] = 1
 matrix[0][1] = 1
 to get 1 we need to go at 0 index of the array that is containing the list 1 2 3
 in that list to get value of 1 to be j we can do get(0) i.e 1
 matrix[0][1] = 1;


 class Solution {
    int[][] adjListToMatrix(int n, ArrayList<Integer>[] adjList) {
       
		int[][] result = new int[n][n];
		for(int i = 0; i<adjList.length; i++){
			for(int j = 0; j<adjList[i].size(); j++){
				result[i][adjList[i].get(j)] = 1;
			}
		}
		return result;
		
    }
}

