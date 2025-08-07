import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] graph;
	static int n,m;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] ans;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new int[n][m];
		visited = new boolean[n][m];
		ans = new int[n][m];

		int sx = 0,sy = 0;

		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++){
				int num = Integer.parseInt(st.nextToken());
				graph[i][j] = num;
				if(num == 2){
					sx = i;
					sy = j;
				}
			}
		}
		bfs(sx,sy);

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(graph[i][j] == 2 || graph[i][j] == 0){
					sb.append("0 ");
				} else if(!visited[i][j]){
					sb.append("-1 ");
				} else {
					sb.append(ans[i][j]).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	static void bfs(int x,int y){
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x,y});
		visited[x][y] = true;
		ans[x][y] = 0;

		while(!q.isEmpty()){
			int[] cur = q.poll();
			int cx = cur[0],cy = cur[1];

			for(int i=0; i<4; i++){
				int nx = cx + dx[i],ny = cy + dy[i];

				if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && graph[nx][ny] == 1){
					visited[nx][ny] = true;
					q.add(new int[]{nx,ny});
					ans[nx][ny] = ans[cx][cy] + 1;
					q.offer(new int[]{nx,ny});
				}
			}
		}
	}
}