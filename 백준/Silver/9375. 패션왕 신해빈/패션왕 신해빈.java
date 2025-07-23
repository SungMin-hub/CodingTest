import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		Map<String, Integer> map;

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++){
			int n = Integer.parseInt(br.readLine());
			map = new HashMap<>();
			StringTokenizer st;
			for(int j=0;j<n;j++){
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String clothes = st.nextToken();
				map.put(clothes, map.getOrDefault(clothes, 0) + 1);
			}
			int answer = 1;
			for(int value : map.values()){
				answer *= (value+1);
			}
			answer--;
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}