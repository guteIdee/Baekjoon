import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int length = 10;
		int count = 1;
		
		for (int i = 1; i <= n; i++) {
			if( i == length) {
				count++;
				length *= 10;
			}
			answer += count;
		}
		
		System.out.println(answer);
	}
}

