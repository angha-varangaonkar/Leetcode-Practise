class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1 ,nums2); //values are passed in the function

        if(ans.length %2 ==0)//even case
        {
            double ans2=(double)(ans[ans.length/2] + ans[ans.length/2 -1])/2; //typecasting bcz the answer is in float
            return ans2;
        }
        else{ //odd case
            double ans2 =(double) (ans[ans.length/2]);

            return ans2;
        }

    }

    public int[] merge(int[] arr1, int[] arr2){
        int[] ans =new int[arr1.length + arr2.length];   //total length of the answer

        int p1=0; //pointing at arr1 
        int p2=0;  //pointing at arr2
        int p3=0;  //pointing at ans

        //or if any one case is true
        while(p1<arr1.length || p2<arr2.length){


            //condition ? true : false
            int val1=p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;  //p1 will get the value of arr1
            int val2=p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;  //p2 will get the value of arr2

            if(val1<val2){
                ans[p3]=val1;  //value of arr1 is less than arr2
                p1++;
            }else{
                ans[p3]=val2;  //value of arr2 is less than arr1
                p2++;
            }
            p3++;
        }
        return ans;
    }


}