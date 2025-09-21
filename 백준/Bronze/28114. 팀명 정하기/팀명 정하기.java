import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P1 = Integer.parseInt(st.nextToken());
		int Y1 = Integer.parseInt(st.nextToken());
		String S1 = st.nextToken();

		st = new StringTokenizer(br.readLine());
		int P2 = Integer.parseInt(st.nextToken());
		int Y2 = Integer.parseInt(st.nextToken());
		String S2 = st.nextToken();

		st = new StringTokenizer(br.readLine());
		int P3 = Integer.parseInt(st.nextToken());
		int Y3 = Integer.parseInt(st.nextToken());
		String S3 = st.nextToken();

		int[] year = {Y1 % 100, Y2 % 100, Y3 % 100};
		Arrays.sort(year);

		StringBuilder sb = new StringBuilder();
		for(int i: year) {
			sb.append(i);
		}
		sb.append("\n");

		Object[][] arr = {{P1,S1},{P2,S2},{P3,S3}};
		Arrays.sort(arr,(a,b) -> (int)b[0] - (int)a[0]);
		for(Object[] o:arr){
			String s = (String)o[1];
			sb.append(s.charAt(0));
		}
		System.out.println(sb);
	}
}
