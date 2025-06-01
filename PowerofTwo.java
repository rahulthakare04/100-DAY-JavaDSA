// LeetCode 231 - Power of Two
// Problem: Check if a given integer 'n' is a power of 2
// An integer is a power of two if there exists an integer x such that n == 2^x

/*
Logic:
1. If n is less than 1, it can never be a power of 2 → return false
2. If n is exactly 1 → it's 2^0 → return true
3. Otherwise:
   - Keep dividing n by 2 as long as it is divisible by 2 (i.e., n % 2 == 0)
   - After the loop, if the result is 1 → it means n was originally a power of 2 → return true
   - Otherwise, if we cannot reach 1 → n is not a power of 2 → return false
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1){
            return false;
        }
        else if(n == 1){
            return true;
        } else {
            while(n % 2 == 0){
                n = n / 2;
            }
            if(n == 1){
                return true;
            } else {
                return false;
            }
        }
    }
}
