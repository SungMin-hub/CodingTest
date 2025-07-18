import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<M;i++){
			String s = br.readLine();

			if(s.startsWith("add")){
				set.add(Integer.parseInt(s.split(" ")[1]));
			} else if(s.startsWith("remove")){
				set.remove(Integer.parseInt(s.split(" ")[1]));
			} else if(s.startsWith("check")){
				sb.append(set.contains(Integer.parseInt(s.split(" ")[1])) ? 1 : 0).append("\n");
			} else if(s.startsWith("toggle")){
				if(set.contains(Integer.parseInt(s.split(" ")[1]))){
					set.remove(Integer.parseInt(s.split(" ")[1]));
				} else {
					set.add(Integer.parseInt(s.split(" ")[1]));
				}
			} else if(s.startsWith("all")){
				for(int j=1;j<=20;j++) set.add(j);
			} else if(s.startsWith("empty")){
				set.clear();
			}
		}
		System.out.println(sb);
	}
}