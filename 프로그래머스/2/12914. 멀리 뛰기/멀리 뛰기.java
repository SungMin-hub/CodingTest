class Solution {
    public long solution(int n) {
        long[] arr = new long[n + 1];
        int MOD = 1234567;

        arr[1] = 1;
        if (n >= 2) arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % MOD;
        }

        return arr[n];
    }
}