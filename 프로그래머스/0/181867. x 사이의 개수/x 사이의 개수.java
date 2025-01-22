class Solution {
    public int[] solution(String myString) {
        int idx=0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x')   idx++;
        }
        
        int[] answer = new int[idx+1];
        int a=0,b=0;;
        
        for(int i=0; i<myString.length(); i++){
            if(i == myString.length()-1){
                answer[b] = a+1;
            }
            if(myString.charAt(i) == 'x') {
                answer[b] = a;
                a=0;
                b++;
                continue;
            }
            else    a++;
        }
        
        return answer;
    }
}