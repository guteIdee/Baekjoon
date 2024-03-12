import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		
		int answer = 1;
		
		while(true) {
			a = Math.ceil(a / 2);
			b = Math.ceil(b / 2);
			
			if(a == b) {
				break;
			}
			else {
				answer++;
			}
		}
		System.out.println(answer);
	}
}