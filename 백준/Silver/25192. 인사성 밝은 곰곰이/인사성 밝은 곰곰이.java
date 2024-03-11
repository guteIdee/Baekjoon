import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(!str.equals("ENTER")) {
				if(!set.contains(str)) {
					set.add(str);
					answer++;
				}
			}
			else {
				set.clear();
			}
		}
		System.out.println(answer);
	}
}