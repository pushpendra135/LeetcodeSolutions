class Solution {
    public int maximumCandies(int[] candies, long k) {
        long l = 1;
        long r = 0;
        for (long candy : candies) {
            r += candy;
        }

        if (r < k)
            return 0;

        r /= k;
        int ans = 0;

        while (l <= r) {
            long mid = l + (r - l) / 2;

            if (isFeasible(candies, k, mid)) {
                ans = (int) mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }

    private boolean isFeasible(int[] candies, long k, long n) {
        if (n == 0)
            return false;
        long c = 0;
        for (int i = 0; i < candies.length; i++) {
            c += candies[i] / n;
        }
        return c >= k;
    }
}