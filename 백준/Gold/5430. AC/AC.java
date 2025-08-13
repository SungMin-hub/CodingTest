import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < T; i++){
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			Deque<Integer> dq = new ArrayDeque<>();
			String input = br.readLine();
			input = input.substring(1, input.length() - 1);
			if(n>0 && !input.isEmpty()){
				String[] arr = input.split(",");
				for(String num : arr){
					dq.add(Integer.parseInt(num));
				}
			}

			boolean error = false;
			boolean reverse = false;

			for(int j=0; j<p.length(); j++){
				if(p.charAt(j) == 'D'){
					if(dq.isEmpty()){
						error = true;
						break;
					} else {
						if(reverse){
							dq.pollLast();
						} else {
							dq.pollFirst();
						}
					}
				} else {
					reverse = !reverse;
				}
			}

			if(error){
				sb.append("error\n");
			} else {
				sb.append("[");
				while(!dq.isEmpty()){
					if(reverse){
						sb.append(dq.pollLast());
					} else {
						sb.append(dq.pollFirst());
					}
					if(!dq.isEmpty()) sb.append(",");
				}
				sb.append("]\n");
			}
		}
		System.out.println(sb);
	}
}