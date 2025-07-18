import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<>();

		for(int i=0;i<N;i++){
			set.add(br.readLine());
		}

		List<String> list = new ArrayList<>();
		for(int i=0;i<M;i++){
			String s = br.readLine();
			if(set.contains(s)){
				list.add(s);
			}
		}
		Collections.sort(list);

		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for(String s : list){
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
}