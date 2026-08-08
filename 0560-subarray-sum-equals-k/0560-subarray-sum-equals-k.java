
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new TreeMap<>();
        int sum=0,ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                ans++;
            }
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}