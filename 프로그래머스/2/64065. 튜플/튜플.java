import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length()-2);
        String[] strs = s.split("\\},\\{");
        Arrays.sort(strs, (a,b) -> a.length() - b.length());
        
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        
        for(String str : strs){
            String[] nums = str.split(",");
            for(String num : nums){
                int n = Integer.parseInt(num);
                if(!set.contains(n)){
                    set.add(n);
                    list.add(n);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}