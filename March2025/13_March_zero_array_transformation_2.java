class Solution {
    public int minZeroArray(int[] nums, int[][] q) {
        int n= nums.length;
        int l=0;
        int r=q.length;
        if(!isFeasible(nums,q,r)){
            return -1;
        }

        while(l<=r){
            int m=(l+r)/2;
            if(isFeasible(nums,q,m)){
                r=m-1;
            } else{
                l=m+1;
            }
        }

        return l;
    }

    private boolean isFeasible(int[] nums, int[][] q, int k){
        int n= nums.length;

        int[] prefixsum=new int[n+1];

        for(int i=0;i<k;i++){
            prefixsum[q[i][0]]+=q[i][2];
            prefixsum[q[i][1]+1]-=q[i][2];
        }

        for(int i=1;i<=n;i++){
            prefixsum[i]+=prefixsum[i-1];
        }

        for(int i=0;i<n;i++){
            if(nums[i]>prefixsum[i]){
                return false;
            }
        }
        return true;
    }
}

