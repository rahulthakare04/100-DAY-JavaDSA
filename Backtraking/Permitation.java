/*
✅ Problem: Generate all permutations of a given string using recursion.

🔍 Approach:
- Use recursion and backtracking.
- At each step, pick one character and fix it as the current character.
- For the remaining string (excluding the chosen character), generate all permutations.
- Repeat this for every character in the string.

⏱ Time Complexity: O(n!)
- For a string of length n, there are n! total permutations.

📌 Notes:
- The function generates all possible orderings of characters.
- No duplicates are handled; if the input has repeated characters, output will have duplicates.
*/





package Backtraking;

public class Permitation {

    public static void findPermitation(String str,String ans){
        //base case 
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newStr=str.substring(0, i)+ str.substring(i+1);
            findPermitation(newStr, ans+current);
    }
    }

    public static void main(String[] args) {
        String str="abc";
        String ans ="";
        findPermitation(str, ans);


    }
}
