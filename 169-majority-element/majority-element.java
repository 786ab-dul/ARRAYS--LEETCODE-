//Abdul's
class Solution {
    public int majorityElement(int[] nums) {
        
        //using MVA[moore's voting algorithm] 
        
        int cand=0;   //cand refers to candidate. Assuming each element as candidate
        int point=0;  //point refers to point got to the candidate

        for(int i=0; i<nums.length; i++){
            if(point==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                point++;
            }else{
                point--;
            }
        }
        return cand;
    }
}