/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if the root is null, the depth is 0
        if (root == null) {
            return 0;
        }
        
        // Recursively find the depth of the left subtree
        int leftHeight = maxDepth(root.left);
        // Recursively find the depth of the right subtree
        int rightHeight = maxDepth(root.right);
        
        // The depth of the current node is 1 + the maximum of the depths of the subtrees
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

/*
 * Approach:
 * 1. Use recursion to find the maximum depth of the left and right subtrees.
 * 2. The maximum depth of the tree is 1 + the maximum depth of the left and right subtrees.
 * 3. If the root is null, return 0 as the base case.
 *
 * Time Complexity: O(n)
 * - The algorithm visits each node exactly once, where n is the number of nodes in the tree.
 *
 * Space Complexity: O(h)
 * - The space complexity is O(h), where h is the height of the tree. This is due to the recursive call stack, which can be at most the height of the tree.
 */
