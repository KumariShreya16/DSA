class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int l = 0;
        int count = 0;

        for (int r = 0; r < nums.length; r++) {

            // If nums[r] is odd, decrease k
            k -= nums[r] % 2;

            // Too many odd numbers
            while (k < 0) {
                k += nums[l] % 2;
                l++;
            }

            // Number of valid subarrays ending at r
            count += r - l + 1;
        }

        return count;
    }
}
