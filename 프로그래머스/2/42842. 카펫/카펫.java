class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = (brown + 4) / 2;
        int dis = sum*sum -4*(brown + yellow);
        
        int x = (sum + (int)Math.sqrt(dis)) / 2;
        int y = (sum - (int)Math.sqrt(dis)) / 2;
        
        return new int[]{x,y};
    }
}