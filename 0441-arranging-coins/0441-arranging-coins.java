class Solution {
    public int arrangeCoins(int n) {
        long l = 0 ,h = n , ans = 0;
        while (l<=h){
            long k = l + (h - l)/2;
            long m = k*(k+1)/2;
            if(n == m) return (int)k;
            else if(m > n){
                h = k-1;
            } else {
                ans = k;
                l = k+1;
            }
        }
        return (int)(ans);
    }
}