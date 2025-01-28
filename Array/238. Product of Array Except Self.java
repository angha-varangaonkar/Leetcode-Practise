//given that this is question is to be solved without using division operator and in o(n)


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] right =new int[n]; //right array

        int pro =1; //product

        for(int i=n-1 ;i>=0;i--){//for loop for right array
            pro=pro*nums[i];
            right[i]=pro;

        }
        int[] ans=new int[n];

        int left=1;

        for(int i=0;i<n-1;i++){
            int val = left * right[i+1];
            ans[i]=val;
            left=left*nums[i];
        }
        ans[n-1]=left;

        return ans;
        
    }
}