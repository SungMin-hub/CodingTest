import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] arr = new char[3];
		boolean flagL = false;
		boolean flagK = false;
		boolean flagP = false;

		for(int i=0;i<3;i++){
			arr[i] = br.readLine().charAt(0);
		}

		for(int i=0;i<3;i++){
			if(arr[i] == 'l') flagL = true;
			if(arr[i] == 'k') flagK = true;
			if(arr[i] == 'p') flagP = true;
		}

		if(flagL && flagK && flagP){
			System.out.println("GLOBAL");
		} else {
			System.out.println("PONIX");
		}
	}
}
