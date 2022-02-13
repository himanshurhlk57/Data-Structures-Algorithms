You will be given the index of the cell from that you gave to start coloring 
the subsequent pixel.
If you are at one of the pixel then you can move in all the 4 direction except
diagonally. And start painting the subsequent cell from that cell and further.

I reached at the cell in which i want to fill new colour
so now i will recursively call on all the 4 cell and in 
the cell where it is the same colour it will make it new color


   0  1  2  3               
0  1  1  1  2
                    
1  3  1  1  2                                       
                  
2  2  1  1  2

3  3  3  3  3

     |
     |
     |


0  1  2  3
0  4  4  4  2
                    
1  3  4  4  2 
                  
2  2  4  4  2

3  3  3  3  3

startingRow(sr), startingColumn(sc) given 1,1
There the currentColor is 1 i have given the newColor(4)
so i will check if the sr,sc is already 4 then in that case we
don't need to do anything just return 
In this case it is 4 at 1,1 so will apply dfs at 1,1 cell
by doing, row-1, row+1, column-1, column+1,
wherever there is 1 we will make it 4 just make sure that
while appyling bfs we move to valid index. Will do check for valid cell

Also if the cell we reached is not the same color as 1,1
we will not apply floodFill at that cell will simply return from there
.

class Solution {
    
    public static void floodFillDfs(int[][] image, int row, int column, int currentColor, int newColor){
        
        if(row < 0 || column < 0 || row >= image.length || column >= image[0].length || image[row][column]!=currentColor){
            return;
        }
        
        image[row][column] = newColor;
        
         floodFillDfs(image, row-1, column, currentColor, newColor);
         floodFillDfs(image, row+1, column, currentColor, newColor);
         floodFillDfs(image, row, column+1, currentColor, newColor);
         floodFillDfs(image, row, column-1, currentColor, newColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        
        floodFillDfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
}