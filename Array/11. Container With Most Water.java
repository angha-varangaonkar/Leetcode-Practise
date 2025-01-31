
class Solution {
    public int maxArea(int[] height) {
        int start=0;  //start pointer
        int end = height.length-1;  //end pointer

        int maxCap=0; //max capacity

        while(start<end){   //this loop will end when start ==end kuki uss case maine koi bhi paani store nahi hoga start aur end dono ek hi jagha khade honge 
            int h= Math.min(height[start],height[end]);  //height dono maine se choti choti height tak he paani bharega varana overflow ho jaayega isliye dono maine se min height is equal to height

            int width =end - start; //end index - start index

            int currCap= h*width;   //current capacity

            maxCap = Math.max(currCap , maxCap);
            
            //start aur end pointer maine se usse move karenge jo chota hoga 
            if(height[start]<height[end]){ //if strt is less than end than start ko move karenge 
                start++;
            }else{ //else end ko --
                end--;
            }
        }

        return maxCap;

        
    }
}