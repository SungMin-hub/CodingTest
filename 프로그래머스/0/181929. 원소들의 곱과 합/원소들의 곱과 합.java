class Solution {
    public int solution(int[] num_list) {
        int prod = 1, sum = 0;
        
        for (int i=0; i<num_list.length; i++){
            prod *= num_list[i];
            sum += num_list[i];
        }
        return prod < sum*sum ? 1 : 0;
    }
}