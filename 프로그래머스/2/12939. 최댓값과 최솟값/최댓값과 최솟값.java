class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            max = Math.max(Integer.parseInt(arr[i]),max);
            min = Math.min(Integer.parseInt(arr[i]),min);
        }
        
        return Integer.toString(min) +" "+ Integer.toString(max);
    }
}