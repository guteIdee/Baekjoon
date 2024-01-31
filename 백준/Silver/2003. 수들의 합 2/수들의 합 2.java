import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < M) {
				int sum = arr[i];
				for (int j = (i + 1); j < arr.length; j++) {
					sum += arr[j];
					if(sum == M) {
						cnt++;
						break;
					}
					else if(sum > M) {
						break;
					}
				}
			}
			else if(arr[i] == M) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
