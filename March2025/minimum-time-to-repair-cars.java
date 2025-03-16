//Daily Challenge -16th March
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l = 1, ans = 0, r = 1L * ranks[0] * cars * cars;

        while (l <= r) {
            long mid = (l + r) / 2;
            if (canRepair(ranks, cars, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;

    }

    private boolean canRepair(int[] ranks, int cars, long m) {
        long car = 0;
        for (int i = 0; i < ranks.length; i++) {
            car += (long) (Math.sqrt((1.0 * m) / ranks[i]));
        }
        return car >= cars;
    }
}