class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length; //n
        int actualSum = (range*(range+1))/2; //n(n+1)/2

        //actual sum is when the missing number is present in the array

        int currSum = 0;

        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];
            //sum of all the elements present in the given array
        }

        int ans = actualSum - currSum; //ans gives the missing number in the array

        return ans;
    
    }
}