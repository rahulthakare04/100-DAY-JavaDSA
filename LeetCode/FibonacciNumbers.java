package LeetCode;

class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int FristTerm=0;
        int SecondTerm=1;

        for(int i=1;i<=n;i++){
            int ThirdTerm=FristTerm+SecondTerm;
            FristTerm=SecondTerm;
            SecondTerm=ThirdTerm;

        }
        return FristTerm;
        
    }
}