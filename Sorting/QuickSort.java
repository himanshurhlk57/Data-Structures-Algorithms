// Quick Sort is one of the most popular and efficient sorting algorithms. It is generally the default sorting algorithms in many programming languages (including C++ and Java).

// Algorithm
// Pick an element, called a pivot, from the array.
// Partitioning: reorder the array so that all elements with values less than the pivot come before the pivot, 
// while all elements with values greater than the pivot come after it (equal values can go either way). 
// After this partitioning, the pivot is in its final position. This is called the partition operation.
// Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
// The base case of the recursion is arrays of size zero or one, which are in order by definition, so they never need to be sorted.

/* We will divide the array in two part but not around mid that we used to do in merge sort
in this will divide the array around pivot element 
Choose an element as pivot whether first mid or last element as element
Choose any element as a pivot and ensure all elements left to the pivot is less than pivot
and all element to the right of the pivot is greater than pivot now we can assure out array is divided in two parts
Now recursively call quicksort on both the part so that our array can be sorted.

Array - 

*/