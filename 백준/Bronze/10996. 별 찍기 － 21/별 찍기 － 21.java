import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 2*N; i++){

			if(i % 2 == 1){
				for(int j = 1; j <= N; j++){
					if(j % 2 == 1){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			}

			else{
				for(int j = 1; j <= N; j++){
					if(j % 2 == 1){
						System.out.print(" ");
					}
					else{
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");

		}
	}
}
