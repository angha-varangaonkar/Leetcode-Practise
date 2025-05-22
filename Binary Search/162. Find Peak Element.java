class Solution {
    public int findPeakElement(int[] nums) {

        if (nums.length==1){ //if there is only one element in array
            return 0;
        }
        else if (nums[0]> nums[1]){ //if our first element is greater 
            return 0;
        }
        else if (nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        else{
            int start=1; //bcoz hum nums0 ko already check kar chuke hai 
            int end = nums.length-2;

            while(start <= end){
                int mid=(start+end)/2;

                if(nums[mid]> nums[mid+1] && nums[mid] > nums[mid-1]){//peak element is present on the mid
                    return mid;
                }
                else if (nums[mid] < nums[mid+1]){
                    start=mid+1;          //if the next element of mid is greater then move the start to right

                }
                else{
                    end=mid-1;
                }
            }
            return -1;
        }
        
    }
}