class Solution {
    public int singleNumber(int[] nums) {
        int one=0, two=0;
        for(final int num:nums){
            one^=(num & ~two);
            two^=(num & ~one);
        }
        
    
    return one;
}
}