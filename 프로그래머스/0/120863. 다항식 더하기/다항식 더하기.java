class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int sum_x = 0;
        int sum_n = 0;
        
        for (int i=0; i<arr.length; i++){
            String number_x = "";
            if(arr[i].charAt(arr[i].length()-1) == 'x'){
                if(arr[i].equals("x")){
                    sum_x++;
                    continue;
                }
                for(int j=0; j<arr[i].length()-1; j++){
                    number_x += arr[i].charAt(j);
                }
                sum_x += Integer.parseInt(number_x);
            } else if(!(arr[i].equals("+"))){
                sum_n += Integer.parseInt(arr[i]);
            }
        }
        if(sum_x == 0 && sum_n == 0) return "0";
        if(sum_x == 1 && sum_n == 0) return "x";
        if(sum_x == 0) return sum_n+"";
        if(sum_n == 0) return sum_x+"x";
        if(sum_x == 1) return "x + "+sum_n;
        
        
        return answer = sum_x +"x + "+sum_n;
    }
}