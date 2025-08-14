import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N,M;
	static int[][] map;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1){
					q.offer(new int[]{i, j});
				}
			}
		}

		bfs();

		int ans = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(map[i][j] == 0){
					System.out.println(-1);
					return;
				}
				ans = Math.max(ans, map[i][j]);
			}
		}
		System.out.println(ans-1);

	}
	static void bfs(){
		while(!q.isEmpty()){
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for(int i=0; i<4; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];

				if(nx<0 || ny<0 || nx>=N || ny>=M) continue;
				if(map[nx][ny] == 0){
					map[nx][ny] = map[x][y] + 1;
					q.add(new int[]{nx, ny});
				}
			}
		}
	}
}