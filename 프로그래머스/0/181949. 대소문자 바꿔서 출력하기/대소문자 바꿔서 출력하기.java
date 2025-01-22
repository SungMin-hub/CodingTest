import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
                str += (char)(a.charAt(i) - 32);
            else
                str += (char)(a.charAt(i) + 32);
        }
        System.out.println(str);
        
    }
}