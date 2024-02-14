import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int max = 0;
		int min = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr[0] = Integer.parseInt(st.nextToken());
		max = arr[0];
		min = arr[0];
		
		for (int i = 1; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
			
		}
		System.out.println(min + " " + max);
	}
}

