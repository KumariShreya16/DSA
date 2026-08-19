class Solution {
    public int smallestNumber(int n, int t) {

        for (int num = n; ; num++) {

            int x = num;
            int product = 1;

            while (x > 0) {
                product *= x % 10;
                x /= 10;
            }

            if (product % t == 0) {
                return num;
            }
        }
    }
}