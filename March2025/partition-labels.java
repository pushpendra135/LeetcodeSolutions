//Daily Challenge -30th March
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        int partitionEnd = 0, partitionStart = 0;

        for (int i = 0; i < s.length(); i++) {
            partitionEnd = Math.max(
                    partitionEnd,
                    last[s.charAt(i) - 'a']);

            if (i == partitionEnd) {
                res.add(i - partitionStart + 1);
                partitionStart = i + 1;
            }
        }

        return res;

    }
}
