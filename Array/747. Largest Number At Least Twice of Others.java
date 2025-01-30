//given the largest number is unique
//and the largest number is the twice of every element present in array


class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;  //max element in the array
        int smax=-1; //second max element in the array
        int maxIdx=0; //index of max value

        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){  //if max is less than numberin the array
                smax = max; //then jo pehle max tha abb vo smax ban jaayega matlab jo pehle 1st tha abb vo 2nd ho jaayega 
                max = nums[i];  
                maxIdx = i;   //indeg according to i
            }
            else if(smax < nums[i]){
                smax = nums[i];
            }
        }

        //if the largest number(max). smax ke twice se bada hai matlab vo saare element se bada hai tu return hoga uska index else -1
        if(smax*2 <= max){  
            return maxIdx;
        }else{
            return -1;
        }
        
    }
}