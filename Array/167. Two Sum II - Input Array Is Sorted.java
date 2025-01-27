// given a sorted array
//there will be only one answer and same  elemnet can not be used twice 

//we will use 2 pointers start and end
//and return these 2 indexses with +1


class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans =new int[2]; //bcoz we only need to return 2 indexses

        int start=0;             //place the pointer at the start of array
        int end=numbers.length-1; //place the pointer at the last of array

        while(start<end){ //we will not take the = in the loop bcz it is given that we can not use same element twice 
            int sum = numbers[start]+numbers[end];

            if(sum==target){
                ans[0]=start+1;  
                ans[1]=end+1;

                return ans;
            }
            else if(sum > target){ //if sum bada hai target se tu yeh ek sorted array hai so usse kam karne ke liye we will move end end--
                end--;
            }
            else{ //if sum chota hai target se tu yeh ek sorted array hai tu usse badhane ke liye we move start and start++
                start++;
            }
        }
        return ans; //by default of leetcode .it excepts a retuRn statememt in the end
        
    }
}