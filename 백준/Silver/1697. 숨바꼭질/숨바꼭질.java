import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] visited = new int[100001];
		Queue<Integer> q = new LinkedList<>();

		q.add(N);
		visited[N] = 1;

		while (!q.isEmpty()) {
			int n = q.poll();

			if(n == K){
				System.out.println(visited[n]-1);
				return;
			}

			int[] next = {n-1,n+1,n*2};
			for(int i: next){
				if(i >= 0 && i <= 100000 && visited[i] == 0){
					visited[i] = visited[n] + 1;
					q.add(i);
				}
			}
		}
	}
}