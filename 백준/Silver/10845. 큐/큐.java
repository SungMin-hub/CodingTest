import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int last = 0;

		for(int i=0; i<N; i++) {
			String s = br.readLine();

			if(s.startsWith("push")) {
				int num = Integer.parseInt(s.split(" ")[1]);
				q.add(num);
				last = num;
			} else if(s.startsWith("pop")) {
				sb.append(q.isEmpty() ? -1 : q.remove()).append("\n");
			} else if(s.startsWith("size")) {
				sb.append(q.size()).append("\n");
			} else if(s.startsWith("empty")) {
				if(q.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if(s.startsWith("front")) {
				sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
			} else if(s.startsWith("back")) {
				sb.append(q.isEmpty() ? -1 : last).append("\n");
			}
		}
		System.out.println(sb);
	}
}