import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(br.readLine());

		String zodiac = "ABCDEFGHIJKL";
		int diff = year - 2013;

		int zodi = (5 + diff) % 12;
		int gan = (9 + diff) % 10;
		
		if (zodi < 0) zodi += 12;
		if (gan < 0) gan += 10;

		System.out.println(zodiac.charAt(zodi) + "" + gan);

	}
}