import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		String[] arr = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

		for (String a : arr) {
			s = s.replace(a, "*");
		}

		System.out.println(s.length());
	}
}