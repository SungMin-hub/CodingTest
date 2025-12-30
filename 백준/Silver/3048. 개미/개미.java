import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N1 = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());

		char[] arr1 = new char[N1];
		String str1 = br.readLine();
		for(int i=0;i<N1;i++){
			arr1[i] = str1.charAt(i);
		}

		char[] arr2 = new char[N2];
		String str2 = br.readLine();
		for(int i=0;i<N2;i++){
			arr2[i] = str2.charAt(i);
		}

		int T = Integer.parseInt(br.readLine());

		int sum = N1 + N2;
		char[] ants = new char[sum];
		boolean[] dir = new boolean[sum];
		
		for (int i = 0; i < N1; i++) {
			ants[i] = arr1[N1 - 1 - i];
			dir[i] = true;
		}
		
		for (int i = 0; i < N2; i++) {
			ants[N1 + i] = arr2[i];
			dir[N1 + i] = false;
		}
		
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < sum - 1; i++) {
				if (dir[i] && !dir[i + 1]) {
					char temp = ants[i];
					ants[i] = ants[i + 1];
					ants[i + 1] = temp;

					boolean d = dir[i];
					dir[i] = dir[i + 1];
					dir[i + 1] = d;

					i++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (char c : ants) sb.append(c);
		System.out.println(sb);
	}
}
