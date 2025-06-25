package LeetCode;

class Solution {
    public boolean isPalindrome(int x) {

        // Step 1: Negative numbers are not palindromes because of the minus sign
        if (x < 0) {
            return false;
        }

        // Step 2: Store the original number in a temporary variable to compare later
        int n = x;

        // Step 3: This will hold the reversed number
        int revnum = 0;

        // Step 4: Loop to reverse the digits of the number
        while (n > 0) {
            // Get the last digit of the number
            int digit = n % 10;

            // Add the digit to the reversed number
            // Multiply revnum by 10 to shift digits left before adding new digit
            revnum = revnum * 10 + digit;

            // Remove the last digit from the number
            n = n / 10;
        }

        // Step 5: Compare the reversed number with the original
        // If they are equal, the number is a palindrome
        if (revnum == x) {
            return true;
        } else {
            return false;
        }
    }
}
