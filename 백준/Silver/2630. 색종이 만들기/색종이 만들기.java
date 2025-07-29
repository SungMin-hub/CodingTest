import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];


		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		divide(0,0,N);

		System.out.println(white);
		System.out.println(blue);
	}
	static void divide(int x,int y, int size){
		if(check(x,y,size)){
			if(arr[x][y] == 0){
				white++;
			} else {
				blue++;
			}
		} else {
			size = size / 2;
			divide(x,y,size);
			divide(x+size,y,size);
			divide(x,y+size,size);
			divide(x+size,y+size,size);
		}
	}
	static boolean check(int x,int y, int size){
		int color = arr[x][y];
		for(int i=x; i<x+size; i++){
			for(int j=y; j<y+size; j++){
				if(color != arr[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}