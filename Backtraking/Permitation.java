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
