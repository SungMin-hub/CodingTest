class Solution {
    public int solution(int n) {
        int oneCount = getOneCount(n);
        int answer = n + 1;

        while (getOneCount(answer) != oneCount) answer++;

        return answer;
    }

    private int getOneCount(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) count++;
            num /= 2;
        }
        return count;
    }
}