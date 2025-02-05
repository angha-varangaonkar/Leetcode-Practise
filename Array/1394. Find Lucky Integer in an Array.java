//the lucky number is the one which has same frequency as the value 
//matlab if 2 hai tu vo array maine do baar aayega 

//we will use hashmap in this question . it has 2 things key and value where key is unique 
//<Integer,Integer> integer bcoz both key and value are integer

class Solution {
    public int findLucky(int[] arr) {
        
    HashMap<Integer,Integer> hm = new HashMap<>(); //created a hashmap of name hm

    //this for loop is for creating and filling hashtable with their key and value 
    for(int i=0;i<arr.length;i++){
        int ele =arr[i];

        //if hai agar humari hashtable maine element aur key already hai then +1 hoga 
        if(hm.containsKey(ele)==true){
            hm.put(ele,hm.get(ele)+1);
        }else{ //if element  aur key nahi hai hashtable maine then usse add  karenge and uska value hoga 1
            hm.put(ele,1);
        }
    }
    int ans=-1;

    //this for loop is for to check humari hashtable maine key == value  and this loop will take input from hashtable 
    for(int key : hm.keySet()){
        if(hm.get(key)==key){
            ans=Math.max(ans,key);
        }
    }

    return ans;
    }
}