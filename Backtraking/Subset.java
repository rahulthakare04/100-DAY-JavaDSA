// ✅ Problem: Generate all subsets (the power set) of a given string using recursion.

// 🔍 Approach:
// - Use recursion and backtracking.
// - At each index, you have two choices:
//   1. Include the current character in the subset.
//   2. Exclude the current character.
// - Repeat this for all characters in the string.
// - When the index reaches the end of the string, print the current subset (answer string).

// ⏱ Time Complexity: O(2^n)
// - For each character, we make 2 choices (include or exclude), leading to 2^n total subsets.

// 📌 Note:
// - This includes the empty subset as well.
// - Subsets are not sorted or unique-filtered (since input has unique characters).
// */



package Backtraking;

public class Subset {

    public static void findSubset(String a,String ans,int i){

        //base case


        if(i==a.length()){
            System.out.println(ans);
            return;
        }
        //recursion 
        //yes 
        findSubset(a, ans+a.charAt(i), i+1);

        //no
        findSubset(a, ans, i+1);

    }
    public static void main(String[] args) {
        String  a="abc";
        String ans="";
        findSubset(a, ans, 0);
    }
}
