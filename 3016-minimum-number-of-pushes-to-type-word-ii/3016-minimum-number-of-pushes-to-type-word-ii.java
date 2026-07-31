class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        
        int cost = 0;
        int push = 0;
        for(int i=25; i>=0; i--){
            cost += freq[i] * (push / 8 + 1);
            push++;
        }
        return cost;
    }
}
    