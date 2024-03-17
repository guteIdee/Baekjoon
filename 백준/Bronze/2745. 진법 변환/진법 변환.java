import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			int digit;
			if(Character.isDigit(c)) {
				digit = c - '0';
			}
			else {
				digit = c - 'A' + 10;
			}
			result = result * b + digit;
		}
		System.out.println(result);
	}
}
