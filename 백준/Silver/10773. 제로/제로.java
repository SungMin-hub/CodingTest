import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<>();

		for(int i=0; i<K; i++){
			int num = Integer.parseInt(br.readLine());
			if(num == 0){
				stk.pop();
			} else {
				stk.push(num);
			}
		}
		int sum = 0;
		while(!stk.isEmpty()){
			sum += stk.pop();
		}
		System.out.println(sum);
	}
}