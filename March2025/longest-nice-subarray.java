//Daily Challenge -18th March

class Solution {
    public int longestNiceSubarray(int[] nums) {

        int used_bits=0;
        int l=0,r=0;

        int res=1;

        while(r<nums.length){

            while((used_bits & nums[r] )!=0){
                used_bits^=nums[l];
                l++;
            }
            used_bits |=nums[r];

            res=Math.max(res,(r-l+1));
            r++;
        }
        return res;
    }
}

