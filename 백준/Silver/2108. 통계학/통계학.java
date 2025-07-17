import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<N;i++){
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
		}

		Arrays.sort(arr);

		int avg = (int)Math.round((double)sum/N);
		int median = arr[arr.length/2];
		int range = max - min;

		int maxCnt = 0;
		for(int val : map.values()){
			maxCnt = Math.max(maxCnt,val);
		}
		List<Integer> list = new ArrayList<>();
		for(int key : map.keySet()){
			if(map.get(key) == maxCnt){
				list.add(key);
			}
		}
		Collections.sort(list);
		int mode = (list.size() > 1) ? list.get(1) : list.get(0);

		System.out.println(avg);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}
}