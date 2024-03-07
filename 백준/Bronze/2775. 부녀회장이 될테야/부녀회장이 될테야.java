import java.io.*;
import java.util.*;

public class Main {
	
	static int howMany(int k, int n) {
		int answer = 0;
		
		if(k == 0) {
			return n;
		}
		
		for (int i = 1; i <= n; i++) {
			answer += howMany(k-1, i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < x; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(howMany(k, n) + "\n");
		}
		
		System.out.println(sb);
		
	}
}