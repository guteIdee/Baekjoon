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
		
		int max = 0;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i] * (arr.length - i));
		}
		System.out.println(max);
	}
}
