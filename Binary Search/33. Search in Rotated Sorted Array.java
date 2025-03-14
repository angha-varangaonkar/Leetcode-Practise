class Solution {
    public int search(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;

       while(start<=end){
        int mid = (start + end )/2;

        //If mid = target than return mid 
        // if mid is the answer 
        if(nums[mid]==target){
            return mid;
        }

        //If start number is less tha middle number to srt the first part
        // if first part is sorted 
        else if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<nums[mid]){
                end = mid -1 ;
            }
            else{
                start = mid + 1 ;
            }
        }

        // To sort the second part 
        //secound part is sorted
        else{
            if(target>=nums[mid] && target<=nums[end]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
       }
       return -1; 
    }
}