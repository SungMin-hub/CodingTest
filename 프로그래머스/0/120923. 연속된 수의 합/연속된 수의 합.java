class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int a = ((2 * total) - (num * (num -1))) / (2 * num);
        for(int i=0; i<num; i++) answer[i] = a++;
        
        return answer;
    }
}