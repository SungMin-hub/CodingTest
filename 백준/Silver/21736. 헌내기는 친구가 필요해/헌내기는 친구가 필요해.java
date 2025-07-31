import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int N,M;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new char[N][M];
		visited = new boolean[N][M];

		int sx = 0, sy = 0;

		for(int i=0; i<N; i++){
			String input = br.readLine();
			for(int j=0; j<M; j++){
				arr[i][j] = input.charAt(j);
				if(arr[i][j] == 'I'){sx = i;sy = j;}
			}
		}
		int ans = bfs(sx, sy);
		System.out.println(ans == 0 ? "TT" : ans);

	}
	static int bfs(int x, int y){
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x, y});
		visited[x][y] = true;

		int cnt = 0;

		while(!q.isEmpty()){
			int[] cur = q.poll();
			int cx = cur[0], cy = cur[1];

			for(int i=0; i<4; i++){
				int nx = cx + dx[i], ny = cy + dy[i];

				if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if(visited[nx][ny] || arr[nx][ny] == 'X') continue;

				visited[nx][ny] = true;
				if(arr[nx][ny] == 'P') cnt++;
				q.add(new int[]{nx, ny});
			}
		}
		return cnt;
	}
}