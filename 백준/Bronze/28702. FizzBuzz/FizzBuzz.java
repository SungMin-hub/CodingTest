import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();

		int num = 0;
		int idx = 0;

		if(isNumber(s3)){
			num = Integer.parseInt(s3);
			idx = 1;
		} else if(isNumber(s2)){
			num = Integer.parseInt(s2);
			idx = 2;
		} else if(isNumber(s1)){
			num = Integer.parseInt(s1);
			idx = 3;
		}

		System.out.println(pattern(num+idx));
	}

	private static boolean isNumber(String s) {
		try{
			Integer.parseInt(s);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}

	private static String pattern(int n) {
		if(n % 15 == 0) return "FizzBuzz";
		else if(n % 5 == 0) return "Buzz";
		else if(n % 3 == 0) return "Fizz";
		else return Integer.toString(n);
	}
}