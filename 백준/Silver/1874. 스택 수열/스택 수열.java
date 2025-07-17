import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		Stack<Integer> st = new Stack<>();

		for(int i=0;i<N;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		StringBuilder sb = new StringBuilder();
		int idx = 0;
		int cur = 1;

		while(idx < N){
			if(!st.isEmpty() && st.peek() == arr[idx]){
				st.pop();
				sb.append("-").append("\n");
				idx++;
			} else if(cur <= N){
				st.push(cur++);
				sb.append("+").append("\n");
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println(sb);
	}
}