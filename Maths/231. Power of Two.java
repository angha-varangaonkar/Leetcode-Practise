class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false; //for negative numbers
        }
        else if(n==1){
            return true;  //special case and only odd number in the 2 power series example 2^0=1 ,2^1=2 ,2^2=4,2^3=8 all are even except one 
        }
        else{
            while(n%2==0){   //if it is divisible by 2 
                n=n/2; // reduce the n eg 16 is reduced to 8 4 2 1
            }
            if(n==1){
                return true;
            }
            else{
                return false;
            }
        }       
    }
}