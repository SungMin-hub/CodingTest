import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N,M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		for(int i = 1; i <= N; i++) {
			int depth = 1;
			dfs(i, depth, i+" ");
		}
		System.out.println(sb);

	}
	static void dfs(int n, int depth, String s) {
		if(depth == M){
			sb.append(s).append("\n");
			return;
		}
		for(int i = n+1; i <= N; i++){
			dfs(i, depth+1,s+i+" ");
		}
	}
}