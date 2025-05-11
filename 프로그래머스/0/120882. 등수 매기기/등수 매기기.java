import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        double[] avg_score = new double[n];

        for (int i = 0; i < n; i++) {
            avg_score[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        Double[] sorted = Arrays.stream(avg_score).boxed().toArray(Double[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());

        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = map.get(avg_score[i]);
        }

        return answer;
    }
}
