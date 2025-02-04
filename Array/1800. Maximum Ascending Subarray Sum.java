//give :
//1.all elements are positive 
//note that the suarray of size 1 is ascending


class Solution {
    public int maxAscendingSum(int[] nums) {
        //max and currmax take the value of first element bcoz first element is always acending and if their is only one element in the array 
        int max=nums[0];
        int currMax=nums[0];

        for(int i=1;i<nums.length;i++){ //just bcoz the max and currMax contain the value of first element the loop starts from 1

            if(nums[i-1]<nums[i]){  //if first element is less than next element then
                currMax=currMax+nums[i]; //the currMax= FIRST ELEMENT AND THAT NUMBER 

            }//if the first element is greater than next element that means it breaks the continuty of the acending array that means abb thak jo currsum calculate kiya tha vo abb tak ka max sum hai matlab uss sub array ka max sum hai
            else{
                 max=Math.max(max,currMax); //fir hum dekhenge ki vo curr sum bada hai humare max sum se or the currMax is greater than first element
                currMax=nums[i];//and then currsum ko hum place kar denge uss element pe jaha pe vo if condition break hue thi
            }

        }
        max=Math.max(max,currMax);  //last maine hum phir se max ko check karenge kuki till the last of the array konsa sum bada hai dekhne ke liye 

        return max;
        
    }
}