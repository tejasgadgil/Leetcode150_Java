class Solution {
    public String longestPalindrome(String s) {
        // Initialize variables to store the longest palindrome substring and its length
        String res = "";
        int reslen = 0;
        int n = s.length();

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            // Odd-length palindromes: expand around the current character
            int l = i;
            int r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                // Update the longest palindrome substring if a longer one is found
                if (r - l + 1 > reslen) {
                    reslen = r - l + 1;
                    res = s.substring(l, r + 1);
                }
                // Expand the window
                l--;
                r++;
            }

            // Even-length palindromes: expand around the current and next characters
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                // Update the longest palindrome substring if a longer one is found
                if (r - l + 1 > reslen) {
                    reslen = r - l + 1;
                    res = s.substring(l, r + 1);
                }
                // Expand the window
                l--;
                r++;
            }
        }
        // Return the longest palindrome substring found
        return res;
    }
}

// The time complexity is O(n^2), where n is the length of the input string, and the space complexity is O(1).
