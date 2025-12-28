import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();

			char[] arrA = a.toCharArray();
			char[] arrB = b.toCharArray();

			Arrays.sort(arrA);
			Arrays.sort(arrB);

			if (Arrays.equals(arrA, arrB)) {
				sb.append(a).append(" & ").append(b).append(" are anagrams.\n");
			} else {
				sb.append(a).append(" & ").append(b).append(" are NOT anagrams.\n");
			}
		}

		System.out.print(sb);
	}
}
