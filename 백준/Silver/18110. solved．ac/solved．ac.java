import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		double sum = 0;
		int x = (int) Math.round(n * 0.15);
		
		for (int i = 0; i < n; i++) {
			if(i >= x && i <= n - 1 - x) {
				sum += arr[i];
			}
		}
		
		int answer = (int) Math.round(sum / (n - x - x));
		System.out.println(answer);
		
	}
}

