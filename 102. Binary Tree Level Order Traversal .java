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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // List to store the levels of the tree
        Queue<TreeNode> queue = new LinkedList<>(); // Queue for BFS

        if (root == null) {
            return result; // If root is null, return an empty list
        }
        queue.add(root); // Add the root to the queue

        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at the current level
            List<Integer> sublist = new ArrayList<>(); // List to store values of the current level
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove(); // Remove the front node of the queue
                
                if (node.left != null) queue.add(node.left); // Add the left child to the queue if it exists
                if (node.right != null) queue.add(node.right); // Add the right child to the queue if it exists
                
                sublist.add(node.val); // Add the value of the current node to the sublist
            }
            result.add(sublist); // Add the sublist to the result list
        }
        return result; // Return the list of levels
    }
}

/*
Approach:
-While the queue is not empty, repeat the following steps:
   - Get the number of nodes at the current level (`size`).
   - Initialize an empty sublist to store the values of the nodes at the current level.
   - For each node at the current level:
     - Dequeue a node from the front of the queue.
     - If the node has a left child, enqueue it.
     - If the node has a right child, enqueue it.
     - Add the value of the node to the sublist.
   - Append the sublist to the result list.

Time Complexity: O(n)
- Each node is processed exactly once, where n is the number of nodes in the tree.

Space Complexity: O(n)
- The space complexity is O(n) due to the additional space used by the queue to store nodes and the result list to store the output.
*/
