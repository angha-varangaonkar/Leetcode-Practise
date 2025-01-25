class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr =0; //creating a pointer

        for(int i=0;i<nums.length;i++){
            if (nums[i] != val){ //for will run even if the if statement is false
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
        
    }
}