import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] arrX = {0,0,1,-1};
	static int[] arrY = {1,-1,0,0};
	static boolean[][] visited;
	static int[][] arr;
	static int M,N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			arr = new int[M][N];
			visited = new boolean[M][N];

			for(int i=0; i<K; i++){
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}

			int cnt = 0;

			for(int i=0; i<M; i++){
				for(int j=0; j<N; j++){
					if(arr[i][j] == 1 && !visited[i][j]){
						bfs(i,j);
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);

	}
	static void bfs(int x, int y){
		visited[x][y] = true;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x, y});

		while(!q.isEmpty()){
			int[] cur = q.poll();
			int curX = cur[0];
			int curY = cur[1];

			for(int i=0; i<4; i++){
				int nX = curX + arrX[i];
				int nY = curY + arrY[i];
				if(nX >= 0 && nY >= 0 && nX < M && nY < N){
					if(arr[nX][nY] == 1 && !visited[nX][nY]){
						visited[nX][nY] = true;
						q.add(new int[]{nX, nY});
					}
				}
			}
		}
	}
}