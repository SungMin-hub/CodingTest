import java.util.*;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (true) {
            List<Integer> nextList = new ArrayList<>();

            for (int i = 0; i + 1 < list.size(); i += 2) {
                int p1 = list.get(i);
                int p2 = list.get(i + 1);

                if ((p1 == a && p2 == b) || (p1 == b && p2 == a)) {
                    return answer;
                }

                nextList.add(fight(p1, p2, a, b));
            }

            list = nextList;
            answer++;
        }
    }

    private int fight(int num1, int num2, int a, int b) {
        if (num1 == a || num2 == a) return a;
        else if (num1 == b || num2 == b) return b;
        return Math.min(num1, num2);
    }
}
