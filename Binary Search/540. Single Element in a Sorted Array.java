//idex ek pair ka humesha even se start hoga aur odd pe khatam hoga 
//start == even 
//end == odd

class Solution {
    public int singleNonDuplicate(int[] nums) {
      
        if(nums.length==1){//if thir is only one element in the array 
            return nums[0];
        }
        else if (nums[0]!=nums[1]){ //checking if first element is the answer
            return nums[0];
        }
        else if(nums[nums.length-1] != nums[nums.length-2]){ //checking if last element is the answer
            return nums[nums.length-1];
        }
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){ //this condition states that mid is the anser and it is not eqal to the right and left element
                return nums[mid];
            }
            else if( mid % 2 == 1){ //mid is on odd index
                if ( nums[mid]==nums[mid-1] ){ //this means the right pasrt is sorted bcoz it is starting with even and ending with odd
                    start = mid+1; 
                }
                else{
                    end = mid-1;
                }
            }
            else{//index of mid is even  
                if(nums[mid] == nums[mid+1]){
                    start = mid+1;
                }
                else{
                   end = mid-1;
                 }

            }


        }
        return -1;
        
        
    }
}