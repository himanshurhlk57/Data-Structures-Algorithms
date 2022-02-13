import java.util.*;
/*  Case 1-> Directed acyclic graph
                    1
              2              3
        4         5      6
             7        8 (6's left)

        BFS -> [1 2 3 4 5 6 7 8] Same as levelOrder Traversal
        Work same as levelOrder traversal of tree because there is no cycle

        starts from 0 -> pointing to 1 
        0's adjacent node 1 add to queue pop 1 print it
        check all adjacent node of 1 i.e 2 and 3 add to the queue
        pop 2 print it add all adjacent node of 2 i.e 4 and 5
        pop 3 print it and add all the adjacent node of 3 i.e 6
        and so on.



        * In case there is cycle in the graph *
        If it is undirected graph then 1 adjacent is 2 
        and if we are at 2 then 2 adjacent is also 1 so again we have to add
        1 and we will caught in the infinite loop
                      1
              2              3     Cycle line is connceted between 5 and 1
        4         5      6
             7        8 (6's left)

             Lets fix it when cyclic graph
             because there is a loop so after popping 5
             will add 1 and 7 and because we have done things with 1 
             so will end up in the infinite loop

             

          
*/

// Code :->

class Solution {
	
	public static void bfsUtil(ArrayList<Integer> result, ArrayList<Integer>[] adjList, int startingNode, boolean[] visited){
		
		visited[startingNode] = true;
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(startingNode);
		
		while(!queue.isEmpty()){
			int node = queue.poll();
			result.add(node);
			
			int edgeCount = adjList[node].size();
			for(int i = 0; i<edgeCount; i++){
				int vertex = adjList[node].get(i);
				if(!visited[vertex]){
					visited[vertex] = true;
					queue.offer(vertex);
				}
			}
		}
	}
	
    ArrayList<Integer> bfs(ArrayList<Integer>[] adjList) {
        ArrayList<Integer> result = new ArrayList<>();
		int startingNode = 0;
		int numOfNode = adjList.length;
		boolean[] visited = new boolean[numOfNode];
		bfsUtil(result, adjList, startingNode, visited);
		return result;
    }
}