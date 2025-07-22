import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] graph;
	static boolean[] visited;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int computer = Integer.parseInt(br.readLine());
		int network = Integer.parseInt(br.readLine());

		graph = new int[computer + 1][computer + 1];
		visited = new boolean[computer + 1];

		StringTokenizer st;
		for(int i=0; i<network; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		dfs(1);

		System.out.println(cnt-1);

	}
	static void dfs(int n){
		visited[n] = true;
		cnt++;
		for(int i=1; i<graph.length; i++){
			if(graph[n][i] == 1 && !visited[i]){
				dfs(i);
			}
		}
	}
}