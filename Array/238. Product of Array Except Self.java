//given that this is question is to be solved without using division operator and in o(n)

//we will create another array right which will store the multiplication from the right

class Solution {
    public int[] productExceptSelf(int[] nums) {

        //this is the code for creating rigth array which contain the product from right
        int n =nums.length;
        int[] right =new int[n]; //right array of same length

        int pro =1; //product

        for(int i=n-1 ;i>=0;i--){//for loop for right array
            pro=pro*nums[i];
            right[i]=pro;

        }

        //ans will contain the final answer using right and left
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