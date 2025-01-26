//array is always sorted starts from negaive or small number and ends in =ve larger number 

//we created 3 pointers start end and ptr 
//two pointer start and end are pointing toward the nums array in the start and in the end and we created them bcoz we will get the largest value either from the most -ve number (in the start) or from the most +ve number (from the end)

class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans= new int[nums.length];

        int start=0;
        int end=nums.length-1;
        int ptr=ans.length-1;

        while(start<=end){ //while loop will end when start gets greater then end in the position of index
            int ss=nums[start]*nums[start];//start ka sqaure
            int es=nums[end]*nums[end];//end ka sqaure

            if(ss>es){
                ans[ptr]=ss;
                start++;
            }
            else{ //we have taken else instead of else if bcoz else handles 2 cases 1. when es > ss and 2. when es == ss
                ans[ptr]=es;
                end--;
            }

            ptr--;

        }
        return ans;
        
    }
}