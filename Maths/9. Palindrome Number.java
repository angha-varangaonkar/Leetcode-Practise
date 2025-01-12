

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; // for negative numbers bcz negative numbers are not palimdrone number
        }

        int n=x;   //taakin n ko compare kar sake
        int revNum=0;

        while(n>0){
            int d=n%10;  //last digit nikalegi

            revNum=revNum*10+d; //reverse number nikalega 

            n=n/10;  // n ko reduce karna matlab 121 se 12 and then 1 

        }

        if(revNum==x){
            return true;
        }else{
            return false;
        }
        
    }
}