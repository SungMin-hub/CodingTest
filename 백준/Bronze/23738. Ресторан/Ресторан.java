import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			switch (c) {
				case 'A': sb.append("a"); break;
				case 'B': sb.append("v"); break;
				case 'E': sb.append("ye"); break;
				case 'K': sb.append("k"); break;
				case 'M': sb.append("m"); break;
				case 'H': sb.append("n"); break;
				case 'O': sb.append("o"); break;
				case 'P': sb.append("r"); break;
				case 'C': sb.append("s"); break;
				case 'T': sb.append("t"); break;
				case 'Y': sb.append("u"); break;
				case 'X': sb.append("h"); break;
			}
		}

		System.out.println(sb);
	}
}	