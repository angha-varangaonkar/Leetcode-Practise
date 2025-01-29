//when a interviever ask this question he wants to know the logic and not the code 
//so a perfect square has odd multiple and the bulb is ON in odd numbers 

class Solution {
    public int bulbSwitch(int n) {
        int count =0;

        int i=1;

        while(i*i<=n){ //just finding the perfect square between the n 
            count ++;
            i++;
        }
        return count;
        
    }
}