import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] square = new char[N][M];

		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<M; j++) {
				square[i][j] = line.charAt(j);
			}
		}

		int min = Integer.MAX_VALUE;

		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				min = Math.min(min,cntPaint(i,j,square));
			}
		}
		System.out.println(min);

	}
	private static int cntPaint(int x, int y, char[][] square) {
		int cnt1 = 0;
		int cnt2 = 0;

		for(int i=x; i<x+8; i++){
			for(int j=y; j<y+8; j++){
				if((i+j) % 2 == 0){
					if(square[i][j] == 'B'){
						cnt1++;
					} else {
						cnt2++;
					}
				} else {
					if(square[i][j] == 'W'){
						cnt1++;
					} else {
						cnt2++;
					}
				}
			}
		}

		return Math.min(cnt1,cnt2);
	}
}