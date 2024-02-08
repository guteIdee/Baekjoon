import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n - 1; i++) {
			int y = Integer.parseInt(st.nextToken());
			int max = 0;
			for (int j = 1; j <= x && j <= y; j++) {
				if(x % j == 0 && y % j == 0)	
					max = j;
			}
			sb.append(x / max + "/" + y / max).append('\n');
		}
		
		System.out.println(sb);
	}
}

