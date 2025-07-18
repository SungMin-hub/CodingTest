import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] arr = new String[N+1];
		Map<String,Integer> map = new HashMap<>();

		for(int i=1;i<=N;i++){
			String input = br.readLine();
			map.put(input,i);
			arr[i] = input;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++){
			String str = br.readLine();
			if(isNumber(str)){
				sb.append(arr[Integer.parseInt(str)]).append("\n");
			} else {
				sb.append(map.get(str)).append("\n");
			}
		}
		System.out.println(sb);
	}
	private static boolean isNumber(String str){
		try{
			Double.parseDouble(str);
		} catch(NumberFormatException e){
			return false;
		}
		return true;
	}
}