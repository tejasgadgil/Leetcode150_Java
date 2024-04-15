import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Initialize a HashMap to store characters and their indices
        HashMap<Character, Integer> present = new HashMap<Character, Integer>();
        // Get the length of the input string
        int len = s.length();
        // Initialize the maximum length of the substring without repeating characters
        int max = 1;
        // If the length of the string is less than 2, return the length
        if (len < 2) {
            return len;
        }

        // Initialize pointers for the left and right ends of the current substring
        int l = 0;
        int r = 1;
        
        // Put the first character of the string into the HashMap
        present.put(s.charAt(l), l);

        // Iterate through the string using the right pointer
        while (r < len) {
            // If the current character is already in the HashMap, update the left pointer to skip the repeating character
            if (present.containsKey(s.charAt(r))) {
                l = Math.max(l, present.get(s.charAt(r)) + 1);
            } 
            // Put the current character and its index into the HashMap
            present.put(s.charAt(r), r);
            // Move the right pointer to the next character
            r++;
            // Update the maximum length of the substring without repeating characters
            max = Math.max(max, r - l);
        }
        // Return the maximum length of the substring without repeating characters
        return max;
    }
}

// The time complexity is O(n), where n is the length of the input string, and the space complexity is O(min(n, m)), where m is the size of the character set.

// testcase : abcabcbb
// Itr	    present	              l	r	max
// 1	  {'a'->0, 'b'->1}	0	1	1
// 2	  {'a'->0, 'b'->1, 'c'->2}	0	2	1
// 3	  {'a'->0, 'b'->1, 'c'->2}	1	3	2
// 4	  {'a'->3, 'b'->4, 'c'->2}	1	4	2
// 5	  {'a'->3, 'b'->4, 'c'->5}	3	5	3
// 6	  {'a'->3, 'b'->6, 'c'->5}	3	6	3
// 7	  {'a'->3, 'b'->7, 'c'->5}	3	7	3
// 8	  {'a'->3, 'b'->8, 'c'->5}	3	8	3

