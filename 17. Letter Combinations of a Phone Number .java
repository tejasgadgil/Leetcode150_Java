import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Solution {
    // Initialize a list to store the result
    List<String> result = new ArrayList<>();
    // Initialize a map to store the mapping of each digit to its corresponding letters
    HashMap<Character, String> letters = new HashMap<Character, String>();

    public List<String> letterCombinations(String digits) {
        // Define the mapping of each digit to its corresponding letters
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

        // If the input string is not empty, start the backtracking process
        if (digits.length() != 0) {
            backtrack(0, "", digits);
        }

        // Return the list of all possible letter combinations
        return result;
    }
    
    // Backtracking function to generate all possible letter combinations
    void backtrack(int i, String currentStr, String digits){
        // Base case: If the length of the current combination equals the length of the input digits, add it to the result
        if (currentStr.length() == digits.length()){
            result.add(currentStr);
            return;
        } 
        // For each letter corresponding to the current digit, recursively call the backtrack function
        for (char c: letters.get(digits.charAt(i)).toCharArray()){
            backtrack(i+1, currentStr + c, digits);
        }
    }
}

// This solution effectively generates all possible letter combinations using backtracking. 
// The time complexity is exponential, as there can be up to 4^n combinations in the worst case (where n is the length of the input string of digits). 
// The space complexity is also exponential due to the recursion stack.
