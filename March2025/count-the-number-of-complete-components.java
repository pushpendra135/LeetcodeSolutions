//Daily Challenge -22nd March
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

        List<Integer>[] g = new ArrayList[n];
        Map<List<Integer>, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
            g[i].add(i);
        }

        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        for (int i = 0; i < n; i++) {
            List<Integer> l = g[i];
            Collections.sort(l);

            freq.put(l, freq.getOrDefault(l, 0) + 1);
        }

        int cc = 0;

        for (var entry : freq.entrySet()) {
            if (entry.getKey().size() == entry.getValue())
                cc++;
        }

        return cc;
    }
}