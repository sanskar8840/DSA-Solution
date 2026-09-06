class Solution {
    public int reverse(int x) {
        int l = (int) Math.pow(-2, 31);
        int r = (int) Math.pow(2, 31) - 1;
        if (x > l && x < r) {

            int i = 0;
            if (x < 0) {
                x = -1 * x;
                i = 1;
            }
            long ans = 0;
            while (x > 0) {
                int last = x % 10;
                ans = ans * 10 + last;
                x = x / 10;
            }
            if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return 0;
            if (i == 1)
                return -1 * (int)ans;
            return (int)ans;
        }
        return 0;

    }
}