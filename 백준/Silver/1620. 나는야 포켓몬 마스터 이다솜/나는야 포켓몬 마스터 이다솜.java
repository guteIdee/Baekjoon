import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> hash1 = new HashMap<>();
		HashMap<String, Integer> hash2 = new HashMap<>();
		
		for (int i = 1; i <= N; i++) {
			String x = br.readLine();
			hash1.put(i, x);
			hash2.put(x, i);
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if(49 <= str.charAt(0) && str.charAt(0) <= 57) {
				sb.append(hash1.get(Integer.parseInt(str))).append('\n');
			}
			else {
				sb.append(hash2.get(str)).append('\n');
			}
		}
		System.out.println(sb);
	}
}
