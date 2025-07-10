import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];
		Map<Integer,String> map = new HashMap<>();

		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = i;
			map.put(i,st.nextToken());
		}

		Arrays.sort(arr, (a,b) -> {
			if(a[0] != b[0]) return a[0] - b[0];
			else return a[1] - b[1];
		});

		StringBuilder sb = new StringBuilder();

		for(int i=0;i<N;i++){
			int idx = arr[i][1];
			sb.append(arr[i][0]).append(" ").append(map.get(idx)).append("\n");
		}
		System.out.println(sb);
	}
}