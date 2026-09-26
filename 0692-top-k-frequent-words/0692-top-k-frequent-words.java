class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();

        for(String s : words)
            map.put(s, map.getOrDefault(s, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b) -> map.get(a).equals(map.get(b))
                ? b.compareTo(a)
                : map.get(a) - map.get(b));

        for(String s : map.keySet()) {
            pq.add(s);
            if(pq.size() > k) pq.poll();
        }

        List<String> ans = new ArrayList<>();

        while(!pq.isEmpty())
            ans.add(pq.poll());

        Collections.reverse(ans);
        return ans;
    }
}