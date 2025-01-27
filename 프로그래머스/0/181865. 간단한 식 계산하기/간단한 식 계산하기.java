class Solution {
    public int solution(String binomial) {
        if(binomial.contains(" + ")) {
            String arr[] = binomial.split(" \\+ ");
            return Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }
        else if(binomial.contains(" - ")) {
            String arr[] = binomial.split(" - ");
            return Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
        }
        else if(binomial.contains(" * ")) {
            String arr[] = binomial.split(" \\* ");
            return Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }
        
        return 0; 
    }
}