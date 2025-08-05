import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String S = br.readLine();

		String p = "I";
		for(int i=0;i<N;i++){
			p += "OI";
		}

		int cnt = 0;
		int len = p.length();

		for(int i=0;i<=M-len;i++){
			if(S.substring(i,i+len).equals(p)){cnt++;}
		}
		System.out.println(cnt);
	}
}