import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());

			int  a = n * s;
			int b = d + n * p;

			if(b<a){
				sb.append("parallelize");
			} else if(b>a){
				sb.append("do not parallelize");
			} else {
				sb.append("does not matter");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
