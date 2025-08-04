import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	static int N;
	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		graph = new int[N][N];
		visited = new boolean[N][N];

		for(int i = 0; i < N; i++){
			String s = br.readLine();
			for(int j = 0; j < N; j++){
				graph[i][j] = s.charAt(j) - '0';
			}
		}

		List<Integer> list = new LinkedList<>();

		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(!visited[i][j] && graph[i][j] == 1){
					int cnt = bfs(j, i);
					list.add(cnt);
				}
			}
		}

		Collections.sort(list);
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	static int bfs(int startX,int startY){
		Queue<int[]> q = new LinkedList<>();
		visited[startY][startX] = true;
		q.add(new int[]{startY, startX});
		int cnt = 1;

		while(!q.isEmpty()){
			int[] cur = q.poll();
			int y = cur[0];
			int x = cur[1];

			for(int k = 0; k < 4; k++){
				int nx = x + dx[k];
				int ny = y + dy[k];

				if(ny >= 0  && nx >= 0 && ny < N && nx < N){
					if(!visited[ny][nx] && graph[ny][nx] == 1){
						visited[ny][nx] = true;
						cnt++;
						q.add(new int[]{ny, nx});
					}
				}
			}
		}
		return cnt;
	}
}