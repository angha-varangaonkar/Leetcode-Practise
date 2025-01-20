class Solution {
    public int maxProduct(int[] nums) {
        int max=-1; //we have initialize them with -1 bcz the array starts with 0  and 1 given in question 
        int smax=-1;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax=max;        // when this condition is ture then the first person becomes the secound person in the race so smax becomes max 
                max=nums[i];
            }
            else if(smax<nums[i]){
                smax=nums[i];//when a number is smller than max but it might be possible that it can be greater than smax so this is the codition to check this
            }
        }
        int ans=(max-1)*(smax-1); //given inquestion

        return ans;

        
    }
}