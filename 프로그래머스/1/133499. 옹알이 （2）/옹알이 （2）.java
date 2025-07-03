class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] arr = {"aya","ye","woo","ma"};
        
        for(int i=0; i<babbling.length; i++){
            String str = "";
            int idx = 0;
            boolean isRight = true;
            
            while(idx < babbling[i].length()) {
                boolean isSame = false;
                
                for(int j=0; j<arr.length; j++){
                    if(babbling[i].startsWith(arr[j],idx)){
                        if(arr[j].equals(str)){
                            isRight = false;
                            break;
                        }
                        str = arr[j];
                        idx += arr[j].length();
                        isSame = true;
                        break;
                    }
                }
                if(!isSame) {
                    isRight = false;
                    break;
                }
            }
            if(isRight) answer++;   
        }
        
        return answer;
    }
}