class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] arr = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        
        for(int i=0; i<a-1; i++){
            day += month[i];
        }
        
        answer = arr[(day+b-1) % 7];
        
        return answer;
    }
}