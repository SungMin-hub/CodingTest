import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		Queue<int []> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				int pri = Integer.parseInt(st.nextToken());
				q.add(new int [] {j,pri});
				pq.add(pri);
			}

			int cnt = 0;

			while(!q.isEmpty()){
				int[] arr =q.poll();

				if(arr[1] == pq.peek()){
					pq.poll();
					cnt++;
					if(arr[0] == M){
						System.out.println(cnt);
						break;
					}
				} else {
					q.add(arr);
				}
			}
			q.clear();
			pq.clear();
		}
	}
}