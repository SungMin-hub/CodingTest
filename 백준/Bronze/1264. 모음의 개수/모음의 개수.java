import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String s = br.readLine();
			if(s.equals("#")){
				break;
			}
			s = s.toLowerCase();
			int num = 0;
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
					num++;
				}
			}
			sb.append(num).append("\n");
		}
		System.out.println(sb);
	}
}
