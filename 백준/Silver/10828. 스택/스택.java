import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stk = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<N; i++) {
			String s = br.readLine();

			if(s.startsWith("push")){
				stk.push(Integer.parseInt(s.split(" ")[1]));
			} else if(s.startsWith("pop")){
				sb.append(stk.isEmpty() ? -1 : stk.pop()).append("\n");
			} else if(s.startsWith("size")){
				sb.append(stk.size()).append("\n");
			} else if(s.startsWith("empty")){
				sb.append(stk.isEmpty() ? 1 : 0).append("\n");
			} else if(s.startsWith("top")) {
				sb.append(stk.isEmpty() ? -1 : stk.peek()).append("\n");
			}
		}
		System.out.println(sb);
	}
}