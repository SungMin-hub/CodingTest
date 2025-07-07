import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int room = 1;
		int floor = 1;

		while (N > room){
			room += 6 * floor++;
		}
		System.out.println(floor);
	}
}