import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (char i = 'a'; i <= 'z'; i++) {
			int ele = -1;
			for (int j = 0; j < str.length(); j++) {
				char x = str.charAt(j);
				if(i == x) {
					ele = j;
					break;
				}
			}
			sb.append(ele + " ");
		}
		System.out.print(sb);
	}
}

