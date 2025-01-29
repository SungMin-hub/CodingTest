class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" = ");
            int ans = Integer.parseInt(arr[1]);
            
            String[] arr1 = arr[0].split(" ");
            if(arr1[1].equals("+")) answer[i] = (ans == Integer.parseInt(arr1[0]) + Integer.parseInt(arr1[2]) ? "O" : "X");
            if(arr1[1].equals("-")) answer[i] = (ans == Integer.parseInt(arr1[0]) - Integer.parseInt(arr1[2]) ? "O" : "X");
        }
        
        return answer;
    }
}