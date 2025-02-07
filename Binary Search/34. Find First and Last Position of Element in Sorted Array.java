//array is always sorted in ascending order 
//this question is tupe of binary search 
//if target element is not present in the array then return [-1,-1] and if present hai tu uska first occurance in the array and last occurance in the array


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        if(nums.length==0){
            return ans;//if array ka length 0 hai tu -1 and -1 return karenge 
        }

        ans[0]=firstOccurence(nums, target);
        ans[1]=lastOccurence(nums, target);

        return ans;
        
    }

    //code of first occurance 
    public int firstOccurence(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;

      int ans=-1;

      while(start<=end){
        int mid =(start+end)/2;

        if(nums[mid]==target){
            ans=mid;
            end=mid-1; //first occurance humesha left maine hogi tu end ko mid -1 
        }else if(target>nums[mid]){
            start=mid+1;//if target bada hai mid se then start ko mid+1 pe leke aayenge 
        }else{
            end=mid-1;
        }
      }  
      return ans; //return the first occurance 
        
    }


    //code of last occurance 
     public int lastOccurence(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;

      int ans=-1;

      while(start<=end){
        int mid =(start+end)/2;

        if(nums[mid]==target){
            ans=mid;
            start=mid+1;//last occurance humesha mid ke baad milega matlab right maine 
        }else if(target>nums[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
      }  
      return ans;  //return the last occurance 
        
    }
}