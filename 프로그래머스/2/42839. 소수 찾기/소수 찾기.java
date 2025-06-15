import java.util.*;

class Solution {
    public int solution(String numbers) {
        int len = numbers.length();
        int answer = 0;
        char[] numArr = new char[len];
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<len; i++) numArr[i] = numbers.charAt(i);
        
        boolean[] visited = new boolean[len];
        
        makeNum(numArr, visited, "", set);
        
        for(int num : set){
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    private boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    
    private void makeNum(char[] numArr, boolean[] visited, String str, Set<Integer> set){
        if(!str.equals("")) set.add(Integer.parseInt(str));
        
        for(int i=0; i<numArr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                makeNum(numArr, visited, str+numArr[i], set);
                visited[i] = false;
            }
        }
        
    }
}