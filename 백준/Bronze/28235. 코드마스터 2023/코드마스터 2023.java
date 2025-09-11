import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.equals("SONGDO"))
			System.out.println("HIGHSCHOOL");
		else if(input.equals("CODE"))
			System.out.println("MASTER");
		else if(input.equals("2023"))
			System.out.println("0611");
		else if(input.equals("ALGORITHM"))
			System.out.println("CONTEST");
	}
}
