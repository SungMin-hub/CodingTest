import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		if(s.equals("0"))
			System.out.println("YONSEI");
		if(s.equals("1"))
			System.out.println("Leading the Way to the Future");
	}
}