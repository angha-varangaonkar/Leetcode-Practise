//in this the first and secound number are given in the question and 0+1 gives the third number 1 then + 1 is 2 this continoues 


class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int firstTerm=0;
            int secTerm=1;

            for(int i=1;i<=n;i++){
                int thirdTerm=firstTerm+secTerm;

                firstTerm=secTerm;
                secTerm=thirdTerm;
            }
            return firstTerm;
        }
        
    }
}
