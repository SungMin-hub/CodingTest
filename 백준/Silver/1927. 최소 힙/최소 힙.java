import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<N;i++){
			int x = Integer.parseInt(br.readLine());

			if(x > 0) pq.add(x);
			else if(x == 0 ) {
				int min = pq.isEmpty() ? 0 : pq.poll();
				sb.append(min).append("\n");
			}
		}
		System.out.println(sb);
	}
}