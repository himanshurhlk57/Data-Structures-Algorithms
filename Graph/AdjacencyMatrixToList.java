Given the nodes and adjacency matrix of a graph, calculate the adjacency list for it.

You have a graph with n nodes indexed from 0 to n-1. You also have the adjacency matrix where each cell denotes whether 
two nodes are connected.




class Solution {
    ArrayList<Integer>[] matrixToAdjList(int n, int[][] matrix) {
        ArrayList<Integer>[] result = new ArrayList[n];
		for(int i = 0; i<result.length; i++){
			result[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++) {
				if(matrix[i][j] == 1) {
					result[i].add(j);
				}
			}
		}
		return result;
    }
}