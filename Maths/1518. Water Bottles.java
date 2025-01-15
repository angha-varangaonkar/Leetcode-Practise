class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;  //total fillled bottles tu drink kar he sakta hai person 

        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange; //kitni bottles exchange kar sakte hai number of bottle se
            int remBottles=numBottles%numExchange; //kitni bottle remaning hai number of bottle se

            ans=ans+newBottles;  //pehle a person can drink all the 15 bottles + the num of exchange of bottles and this will continue

            numBottles=newBottles+remBottles;

        }
        return ans;
    }
}