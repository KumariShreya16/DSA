class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)set.add(n);

        int result=0;

        for(int n:set){
            if(!set.contains(n-1)){
                int count=1;

                while(set.contains(n+count))
                  count++;
                result=Math.max(result,count);
            }
        }
        return result;

    }
}