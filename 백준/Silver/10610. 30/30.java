import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int[] arr = new int[N.length()];
		
		int sum = 0;
		
		for (int i = 0; i < N.length(); i++) {
			arr[i] = N.charAt(i) - 48;
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		if(sum % 3 == 0 && arr[0] == 0) {
			for (int i = N.length() - 1; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		}
		else {
			System.out.println(-1);
		}
	}
}
