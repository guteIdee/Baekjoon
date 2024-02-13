import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < 9; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a > max) {
				max = a;
				index = i;
			}
		}
		System.out.println(max + "\n" + (index + 1));
	}
}

