import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(br.readLine());
		int[] arr = new int[2];
		String s = br.readLine();
		for(int i=0; i<V; i++){
			if(s.charAt(i) == 'A'){
				arr[0]++;
			} else {
				arr[1]++;
			}
		}
		if(arr[0] > arr[1]){
			System.out.println("A");
		} else if(arr[0] < arr[1]){
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
	}
}