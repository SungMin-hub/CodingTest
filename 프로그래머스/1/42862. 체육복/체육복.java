import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setR = new HashSet<>();
        Set<Integer> setL = new HashSet<>();
        
        for (int i = 0; i < n; i++) set.add(i + 1);
        
        for (int i=0; i<reserve.length; i++) setR.add(reserve[i]);
        for (int i=0; i<lost.length; i++) {
            if (setR.contains(lost[i])) setR.remove(lost[i]);
            else setL.add(lost[i]);
        }

        for (int r : setR) {
            if (setL.contains(r - 1)) setL.remove(r - 1);
            else if (setL.contains(r + 1)) setL.remove(r + 1);
        }

        return set.size() - setL.size(); 
    }
}