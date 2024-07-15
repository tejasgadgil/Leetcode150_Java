import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to count the occurrences of each character in the magazine
        HashMap<Character, Integer> mag = new HashMap<>();
        
        // Iterate through each character in the magazine
        for(char c : magazine.toCharArray()){
            // Get the current count of the character, if it exists; otherwise, use 0
            int count = mag.containsKey(c) ? mag.get(c) : 0;
            // Update the count of the character in the HashMap
            mag.put(c, count + 1);
        }
        
        // Iterate through each character in the ransom note
        for(char c : ransomNote.toCharArray()){
            // Check if the character exists in the HashMap and has a count greater than 0
            if (mag.containsKey(c) && mag.get(c) > 0){
                // Decrement the count of the character in the HashMap
                int count = mag.get(c);
                mag.put(c, count - 1);
            }
            else {
                // If the character does not exist or the count is 0, return false
                return false;
            }
        }
        
        // If all characters in the ransom note can be constructed from the magazine, return true
        return true;
    }
}

/*
Time Complexity: O(n + m)
- The first loop runs in O(m) time, where m is the length of the magazine.
- The second loop runs in O(n) time, where n is the length of the ransom note.
- Overall, the time complexity is O(n + m).

Space Complexity: O(k)

Approach:
- HashMap
*/
