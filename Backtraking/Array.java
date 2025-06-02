/*
 * 🧠 Problem: Fill an array recursively and then backtrack to modify it
 *
 * 👇 Approach:
 * 1. Start with an empty array.
 * 2. Use recursion to fill it with incremental values (starting from val).
 * 3. When base case is reached (i == arr.length), print the array.
 * 4. On backtracking, reduce each value by 2 (i.e., simulate "undo" step).
 * 5. Print the array again after full recursion to see backtracked version.
 *
 * 🔁 Example output:
 * Forward fill: 1 2 3 4 5
 * Backtrack    : -1 0 1 2 3
 */




package Backtraking;

public class Array {


    public static void changeArray(int arr[],int i, int val ){
        //base case 
        if(i==arr.length){
            printArray(arr);
            return;
        }



        //recursion

        arr[i]=val;
        changeArray(arr, i+1, val+1);
        arr[i]=arr[i]-2;

    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);

    }
}
