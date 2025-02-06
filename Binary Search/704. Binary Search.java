//the array is always sorted in assending order
//if the number exists in array then return index else return -1
//time complexcity is o(log n)
//it is widely used bcoz yeh discard karta hai aur aray ko chota karta hai 
//start =0; end = nums.length-1;mid =(start+end )/2 
//nums.length count karta hai array ke elements from 1


class Solution {
    public int search(int[] nums, int target) {

        int start=0;
        int end =nums.length-1;

        while(start<=end){ //this loop will end when start aage nikal jaayega array se aur end se or start aage badh jaayega end se 
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){//if target bada hai mid se tu start ko mid ke  aage leke aayenge 
                start=mid +1;
            }
            else{ //if target chota hai mid se then end ko aage leke aayenge mid se 
                end=mid-1;
            }
        }

        return -1;

        
    }
}