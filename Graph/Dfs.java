/* Start from any of the node and go to its depth till we need to return from it

Depth-First Traversal of an acyclic graph is very similar to the preorder traversal of a tree. The traversal starts from a node and then it is recursively called for its children.

In the case of a cyclic graph, the same node can be visited again if we use the above approach and so we need to keep track of already visited nodes as well in a traversal.

The algorithm works by starting to traverse from a node to one of its children and recursively doing the same until it cannot
 (no unvisited node in the path) and then backtracks to traverse other paths (other unvisited nodes).

Given adjacency list of graph compute its dfs
                

                              1
                       2            6
                  3       4     7
                                   
                      5      8
            Dfs -> [1,2,3,4,5,6,7,8]
 
    Can consider node indexed 0 to be the root
    Adjacency list given ->
    1 - 2

    Taking number from 0 to n-1 where n is the no. of nodes
    0,1,2, does not denote the value of the graph node
    value can be anything it just denote the this is the
    0th node, 1st node, 2nd node so on

*/

Code

class Solution {
	
	static void dfsUtil(ArrayList<Integer> result, ArrayList<Integer>[] adjList, int index, boolean[] visited){
		
		visited[index] = true;
		result.add(index);
		
		int edgeCount = adjList[index].size();
		for(int i = 0; i<edgeCount; i++){
			int vertex = adjList[index].get(i);
			if(!visited[vertex]){
				dfsUtil(result, adjList, vertex, visited);
			}
		}
	}
	
    ArrayList<Integer> dfs(ArrayList<Integer>[] adjList){
		
        ArrayList<Integer> result = new ArrayList<>();
		int numOfVertex = adjList.length;
		boolean[] visited = new boolean[numOfVertex];
		int index = 0;
		dfsUtil(result, adjList, index, visited);
		return result;
		
    }
}