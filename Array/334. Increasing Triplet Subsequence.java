//this question can be done using broot force but it will o(n3) 
//but we need to do in o(n) and o(1)


class Solution {
    public boolean increasingTriplet(int[] nums) {

        //+infinte taaki kaam kar sake   
        //agar 8 bada hai 4 se matlab 4 chota hai and first element chota hona chaiye second and third se
        //4 ke jayada potential hai ki aage jaa ke ek bada number banane ke 
        int first=Integer.MAX_VALUE;  //max_value =+infinte  // sbse chota element
        int second=Integer.MAX_VALUE;   //jo first se bada ho
        int third=Integer.MAX_VALUE;   //jo second se bada ho 

        for(int i=0;i<nums.length;i++){
            int ele=nums[i];

            if(first>=ele){
                first=ele;
            }
            else if(second>=ele){
                second=ele;
            }
            else{
                third=ele;
                return true;
            }
        }
        return false;
        
    }
}