import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();

		String[] arr = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

		long ans = -1;

		for(int i=0; i<arr.length; i++){
			if(A.equals(arr[i])){
				ans = i;
				break;
			}
		}

		for(int i=0; i<arr.length; i++){
			if(B.equals(arr[i])){
				ans = ans * 10 + i;
				break;
			}
		}

		for(int i=0; i<arr.length; i++){
			if(C.equals(arr[i])){
				ans *= (long)Math.pow(10, i);
				break;
			}
		}

		System.out.println(ans);

	}
}
