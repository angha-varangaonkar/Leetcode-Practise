//in this question we also need to give the index of the target which is not present in the array but if vo element hota tu kaha hota uss array maine

class Solution {
    public int searchInsert(int[] nums, int target) {
        //basic code of binary search 
        int start=0;
        int end=nums.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start; //start will always give the position jis pe vo element hoga yah fir hona chaiye 
        
    }
}