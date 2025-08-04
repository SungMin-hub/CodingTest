import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static boolean[][] visited;
	static int[][] graph;
	static int N,M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 1; j <= M; j++) {
				graph[i][j] = s.charAt(j - 1) - '0';
			}
		}
		System.out.println(bfs(1,1));
	}
	static int bfs(int startX, int startY){
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{startY, startX});
		visited[startY][startX] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int y = cur[0];
			int x = cur[1];

			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (ny >= 1 && ny <= N && nx >= 1 && nx <= M) {
					if(!visited[ny][nx] && graph[ny][nx] == 1) {
						visited[ny][nx] = true;
						graph[ny][nx] = graph[y][x] + 1;
						q.add(new int[]{ny, nx});
					}
				}
			}
		}
		return graph[N][M];
	}
}