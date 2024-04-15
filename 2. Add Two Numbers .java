class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize variables for the starting node of the result and carry
        ListNode result = new ListNode();
        ListNode start = result;
        int carry = 0;

        // Iterate through both linked lists until either one reaches the end
        while (l1 != null || l2 != null) {
            // Extract the values of the current nodes, handling the case where one of the lists has reached the end
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the current digits and the carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            // Create a new node with the sum modulo 10 and link it to the result list
            result.next = new ListNode(sum % 10);
            result = result.next;

            // Move to the next nodes in both lists, handling the case where one of the lists has reached the end
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        // If there's a remaining carry, create a new node for it
        if (carry > 0) {
            result.next = new ListNode(carry);
        }

        // Return the next node after the starting node, which is the head of the result list
        return start.next;
    }
}

// The time complexity is O(max(m, n)), where m and n are the lengths of the input linked lists. 
// The space complexity is O(max(m, n)) for the resulting linked list.
