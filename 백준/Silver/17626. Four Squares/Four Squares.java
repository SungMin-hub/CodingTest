import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int min = 4;

		for(int i=0; i*i<=n; i++){
			for(int j=0; j<=i; j++){
				for(int k=0; k<=j; k++){
					for(int l=0; l<=k; l++){
						if(i*i + j*j + k*k + l*l == n){
							int cnt = 4;
							if(i == 0) cnt--;
							if(j == 0) cnt--;
							if(k == 0) cnt--;
							if(l == 0) cnt--;
							min = Math.min(min, cnt);
						}
					}
				}
			}
		}
		System.out.println(min);
	}
}