//Daily Challenge -24th March
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b) ->Integer.compare(a[0],b[0]));

        int res= meetings[0][0]-1;
        int end=meetings[0][1];

        for(int i=1;i<meetings.length;i++){
            if(meetings[i][0]>end){
                res+=(meetings[i][0]-1)-end;
            }
            end= Math.max(end,meetings[i][1]);
        }

        if(days>end)
            res+= (days-end);

        return res;
    }
}