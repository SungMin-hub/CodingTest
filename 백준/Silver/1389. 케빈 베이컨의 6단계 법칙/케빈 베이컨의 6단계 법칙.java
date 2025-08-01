import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N,M;
	static int[][] graph;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new int[N+1][N+1];
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}

		int min = Integer.MAX_VALUE;
		int ans = 0;
		for(int i=1; i<=N; i++){
			int cnt = bfs(i);
			if(cnt < min){
				min = cnt;
				ans = i;
			}
		}
		System.out.println(ans);

	}
	static int bfs(int start){
		Queue<Integer> q = new LinkedList<>();
		int[] dist = new int[N+1];
		q.add(start);
		for(int i=0; i<=N; i++){dist[i] = -1;}
		dist[start] = 0;

		while(!q.isEmpty()){
			int cur = q.poll();
			for(int i=1; i<=N; i++){
				if(graph[cur][i] == 1 && dist[i] == -1){
					dist[i] = dist[cur] + 1;
					q.add(i);
				}
			}
		}
		int sum = 0;
		for(int i=1; i<=N; i++){
			sum += dist[i];
		}
		return sum;
	}
}