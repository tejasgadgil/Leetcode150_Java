/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode();
        // Pointer to traverse the merged list
        ListNode cur = dummy;
        
        // Traverse both lists simultaneously until one of them reaches the end
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                // If the value in list1 is smaller, append it to the merged list
                cur.next = list1;
                list1 = list1.next;
            }
            else {
                // If the value in list2 is smaller or equal, append it to the merged list
                cur.next = list2;
                list2 = list2.next;
            }
            // Move the pointer to the next node in the merged list
            cur = cur.next;
        }  

        // If any list still has remaining nodes, append them to the merged list
        if (list1 != null){
            cur.next = list1;
        } 
        else if (list2 != null){
            cur.next = list2;
        }

        // Return the next of the dummy node, which is the head of the merged list
        return dummy.next;
    }
}



// Time Complexity:
// The time complexity of this solution is O(m + n), where m and n are the lengths of the two input linked lists. This is because the algorithm traverses both lists simultaneously, comparing and appending nodes until one of the lists reaches the end.

// Space Complexity:
// The space complexity is O(1) because the extra space used does not depend on the size of the input. The algorithm only uses a constant amount of extra space for pointers and the dummy node.
