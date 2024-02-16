import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			StringBuffer s = new StringBuffer();
			for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < a; j2++) {
					s.append(str.charAt(j));
				}
			}
			sb.append(s).append('\n');
		}
		System.out.println(sb);
	}
}

