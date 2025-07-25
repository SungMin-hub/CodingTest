import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] graph;
	static boolean[] visited;
	static int N;
	static StringBuilder  sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		graph = new int[N+1][N+1];
		visited = new boolean[N+1];

		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}

		dfs(V);
		sb.append("\n");

		visited = new boolean[N+1];

		bfs(V);
		sb.append("\n");

		System.out.println(sb);
	}
	private static void dfs(int v){
		visited[v] = true;
		sb.append(v).append(" ");
		for(int i=1; i<=N; i++){
			if(graph[v][i] == 1 && !visited[i]){
				dfs(i);
			}
		}
	}
	private static void bfs(int v){
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visited[v] = true;

		while(!q.isEmpty()){
			int cur = q.poll();
			sb.append(cur).append(" ");
			for(int i=1; i<=N; i++){
				if(graph[cur][i] == 1 && !visited[i]){
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}