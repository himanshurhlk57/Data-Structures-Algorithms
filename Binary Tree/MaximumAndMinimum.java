static int leftSubtreeMaximum(TreeNode root){
    if(root == null){
        return Integer.MIN_VALUE;
    }
   int leftLargest = leftSubtreeMaximum(root.left);
   int rightLargest = leftSubtreeMaximum(root.right);
   return Math.max(root.val, Math.max(leftLargest, rightLargest));
}
   
   static int rightSubtreeMinimum(TreeNode root){
       if(root == null){
           return Integer.MAX_VALUE;
       }
       int leftMinimum = rightSubtreeMinimum(root.left);
       int rightMinimum = rightSubtreeMinimum(root.right);
       return Math.min(root.val, Math.min(leftMinimum, rightMinimum));
   }