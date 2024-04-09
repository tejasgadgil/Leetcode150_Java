class Solution {
    public int[] plusOne(int[] digits) {
        // Iterate through the digits array starting from the least significant digit
        for (int i = digits.length - 1; i > -1; i--) {
            // If the current digit is less than 9, increment it by 1 and return the updated array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        // If all digits are 9, create a new array with one additional digit and set the most significant digit to 1
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}


// Time Complexity:
// The time complexity of this solution is O(n), where n is the number of digits in the input array. This is because the algorithm iterates through each digit in the array once.

// Space Complexity:
// The space complexity is O(n) in the worst case when all digits are 9 and a new array with one additional digit needs to be created. Otherwise, the space complexity is O(1) as the algorithm only modifies the input array in place without using any extra space proportional to the input size.
