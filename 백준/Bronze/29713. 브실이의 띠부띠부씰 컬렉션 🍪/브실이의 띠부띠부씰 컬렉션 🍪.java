import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();

		Map<Character, Integer> map = new HashMap<>();
		map.put('B', 1);
		map.put('R', 2);
		map.put('O', 1);
		map.put('N', 1);
		map.put('Z', 1);
		map.put('E', 2);
		map.put('S', 1);
		map.put('I', 1);
		map.put('L', 1);
		map.put('V', 1);

		Map<Character, Integer> cnt = new HashMap<>();
		for (char c : input.toCharArray()) {
			cnt.put(c, cnt.getOrDefault(c, 0) + 1);
		}

		int ans = Integer.MAX_VALUE;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			char c = entry.getKey();
			int need = entry.getValue();
			int have = cnt.getOrDefault(c, 0);

			ans = Math.min(ans, have / need);
		}

		System.out.println(ans);
	}
}
