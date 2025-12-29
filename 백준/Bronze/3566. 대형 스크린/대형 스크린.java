import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int rh = Integer.parseInt(st.nextToken());
		int rv = Integer.parseInt(st.nextToken());
		int sh = Integer.parseInt(st.nextToken());
		int sv = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(br.readLine());
		long ans = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int rhi = Integer.parseInt(st.nextToken());
			int rvi = Integer.parseInt(st.nextToken());
			int shi = Integer.parseInt(st.nextToken());
			int svi = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());

			long cntH = Math.max(
				(rh + rhi - 1) / rhi,
				(sh + shi - 1) / shi
			);
			long cntV = Math.max(
				(rv + rvi - 1) / rvi,
				(sv + svi - 1) / svi
			);
			ans = Math.min(ans, cntH * cntV * price);

			long cntH2 = Math.max(
				(rh + rvi - 1) / rvi,
				(sh + svi - 1) / svi
			);
			long cntV2 = Math.max(
				(rv + rhi - 1) / rhi,
				(sv + shi - 1) / shi
			);
			ans = Math.min(ans, cntH2 * cntV2 * price);
		}

		System.out.println(ans);
	}
}
