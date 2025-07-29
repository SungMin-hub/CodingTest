import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] graph;
	static boolean[] visited;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		graph = new boolean[N+1][N+1];
		visited = new boolean[N+1];
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u][v] = true;
			graph[v][u] = true;
		}
		int cnt = 0;
		for(int i=1; i<=N; i++){
			if(!visited[i]){
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	private static void dfs(int n){
		visited[n] = true;
		for(int i=1; i<=N; i++){
			if(graph[n][i] && !visited[i]){
				dfs(i);
			}
		}
	}
}