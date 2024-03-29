import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort the array of strings lexicographically
        Arrays.sort(strs);
        
        // Get the first and last strings after sorting
        String f = strs[0];
        String l = strs[strs.length-1];
        
        // Determine the minimum length among the first and last strings
        int n = Math.min(f.length(), l.length());
        
        // Initialize an index to track the common prefix length
        int i = 0;
        
        // Iterate through characters of the first and last strings until they differ or reach the minimum length
        while (i < n && f.charAt(i) == l.charAt(i)) {
            i++;
        }
        
        // Return the substring of the first string up to the common prefix length
        return f.substring(0, i);
    }
}


/*
Time Complexity:

Sorting the array of strings takes O(n log n) time, where n is the number of strings in the array and the average length of the strings.
After sorting, the algorithm iterates through characters of the first and last strings, which takes O(m) time, where m is the length of the common prefix between the first and last strings.
Overall, the time complexity is O(n log n) due to sorting.

Space Complexity:

The space complexity is O(1) because the extra space used does not depend on the input size. The space usage remains constant regardless of the size of the input array or the length of the strings.
*/
