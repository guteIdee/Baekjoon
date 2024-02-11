import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int sort[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int ele = Integer.parseInt(st.nextToken());
			arr[i] = ele;
			sort[i] = ele;
			
		}
		
		Arrays.sort(sort);
		Map<Integer, Integer> map = new HashMap<>();
		int value = 0;
		
		for (int i = 0; i < sort.length; i++) {
			int key = sort[i];
			if(i != 0) {
				if(sort[i] != sort[i - 1]) {
					value++;
				}
			}
			map.put(key, value);
		}
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < sort.length; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		
		System.out.print(sb);
	}
}

