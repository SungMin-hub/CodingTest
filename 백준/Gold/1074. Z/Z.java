import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int r,c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		int size = (int)Math.pow(2,N);
		int ans = fill(0,0,size);
		System.out.println(ans);
	}
	static int fill(int row, int col, int size) {
		if(size == 1) {
			return 0;
		}
		int half = size / 2;
		int halfPow = half * half;

		if(r < row + half && c < col + half) {
			return fill(row,col,half);
		}

		if(r < row + half && c >= col + half) {
			return halfPow + fill(row, col + half, half);
		}

		if(r >= row + half && c < col + half) {
			return 2 * halfPow + fill(row + half, col, half);
		}

		return 3 * halfPow + fill(row + half,col + half,half);
	}
}