/*Delete 3 node from the tree lets understand from 4 different 
scenarios where 3 can be present in the tree

Delete 3


1 -> Node to be deleted is leaf node
          5
        3   6
              7
              
3 is smaller than 5 so 3 should be in left part
when we reach 3 we get to know it is leaf node so instead 
of returing 3 will return null that means it is deleted

2-> Node to be deleted has one children(left)
           5
       3     6
    2           7

 Reached 3 , 3's left has some value so will return 2 instead of 3
 so 5 will point to 2 now 3 has been deleted

 3-> Node to be deleted has one children(left)
          5
       3     6
          4     7

Reached 3 , 3's right has some value so will return 4 instead of 3
 so 5 will point to 4 now 3 has been deleted
            

4-> Node to be deleted has two children
          5
       3     6
    2    4      7
    
  3's  left is also not null as well as right is also not null

*/