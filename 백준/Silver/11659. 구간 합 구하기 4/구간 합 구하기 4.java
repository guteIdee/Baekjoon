import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		int[] sum = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
			if(i == 0) {
				sum[0] = arr[0];
			}
			else {
				sum[i] = sum[i - 1] + arr[i];
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			
			if(a - 1 == 0) {
				sb.append(sum[b - 1]).append('\n');
			}
			else {
				sb.append(sum[b - 1] - sum[a - 2]).append('\n');
			}
		}
		
		System.out.println(sb);
	}
}

