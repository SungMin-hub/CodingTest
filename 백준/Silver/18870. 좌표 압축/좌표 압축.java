import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Set<Integer> set = new TreeSet<>();
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			set.add(num);
			arr[i] = num;
		}

		List<Integer> list = new ArrayList<>(set);
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<list.size(); i++) {
			map.put(list.get(i), i);
		}

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<N; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb);
	}
}