import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<3; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int sum = a + b + c + d;
			if(sum == 1){
				sb.append("C").append('\n');
			} else if(sum == 2){
				sb.append("B").append('\n');
			} else if(sum == 3){
				sb.append("A").append('\n');
			} else if(sum == 0){
				sb.append("D").append('\n');
			} else if(sum == 4){
				sb.append("E").append('\n');
			}
		}
		System.out.println(sb);

	}
}
