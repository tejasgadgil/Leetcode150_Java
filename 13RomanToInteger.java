import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Replace special substrings with simpler equivalents to simplify processing
        s = s.replace("IV","IIII").replace("IX","VIIII");
        s = s.replace("XL","XXXX").replace("XC","LXXXX");
        s = s.replace("CD","CCCC").replace("CM","DCCCC");

        // Create a HashMap to store Roman numeral characters and their corresponding integer values
        HashMap<Character, Integer> value = new HashMap<Character, Integer>();
        value.put('I',1);
        value.put('V',5);
        value.put('X',10);
        value.put('L',50);
        value.put('C',100);
        value.put('D',500);
        value.put('M',1000);

        // Initialize result variable to accumulate the total integer value
        int result = 0;
        // Iterate through each character in the simplified Roman numeral string
        for (int i = 0; i < s.length(); i++){
            // Add the integer value corresponding to the current character to the result
            result += value.get(s.charAt(i));
        }
        // Return the final accumulated result
        return result;
    }
}

/*Time Complexity:

The time complexity of this solution is O(n), where n is the length of the input string 's'. This is because the algorithm iterates through each character of the string once to compute the integer value.
Space Complexity:

The space complexity is O(1) because the extra space used does not grow with the size of the input. The HashMap value contains a fixed number of mappings for Roman numeral characters to their integer values, which remains constant regardless of the input size.
*/
