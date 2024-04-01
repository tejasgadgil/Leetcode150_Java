import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Map to store closing brackets as keys and their corresponding opening brackets as values
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put(')', '(');

        // Stack to store opening brackets encountered so far
        Stack<Character> stack = new Stack<Character>();

        int n = s.length();
        // Iterate through each character in the input string
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                // If the character is an opening bracket, push onto the stack
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && stack.peek() == brackets.get(s.charAt(i))) {
                // If the character is a closing bracket and matches the top of the stack, pop from the stack
                stack.pop();
            } else {
                // If the character is a closing bracket, but stack is empty or the top of stack doesn't match
                return false;
            }
        }

        // If all opening brackets have been matched and stack is empty, return true, otherwise return false
        return stack.isEmpty();
    }
}


/*Time Complexity:
The time complexity of this solution is O(n), where n is the length of the input string 's'. This is because the algorithm iterates through each character of the string once.

Space Complexity:
The space complexity is O(n), where n is the length of the input string 's'. This is because the algorithm uses a stack to store opening brackets, and in the worst case, the stack could contain all the opening brackets if the string consists entirely of opening brackets. Additionally, the HashMap 'brackets' occupies constant space.
*/
