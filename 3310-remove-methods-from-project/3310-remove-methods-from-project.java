class Solution {

    void dfs(int node, List<List<Integer>> adj, boolean[] sus) {
        sus[node] = true;

        for (int next : adj.get(node)) {
            if (!sus[next])
                dfs(next, adj, sus);
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] e : invocations)
            adj.get(e[0]).add(e[1]);

        boolean[] sus = new boolean[n];

        dfs(k, adj, sus);

        // Outside method calling suspicious method
        for (int[] e : invocations) {
            if (!sus[e[0]] && sus[e[1]]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    ans.add(i);
                return ans;
            }
        }

        // Keep only non-suspicious methods
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!sus[i])
                ans.add(i);
        }

        return ans;
    }
}