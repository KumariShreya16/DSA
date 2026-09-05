class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         for (int i = 0; i < flowerbed.length; i++) {
            if(i + 1 != flowerbed.length && flowerbed[i+1] == 1) continue;
            if (flowerbed[i] != 1) {
                n--;
                i++;
            } else i++;
        }
        return n <= 0;
    }
}