import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<Long> list = new ArrayList<>();
		list.add((long) 0);
		
		list.add((long) 1);
		list.add((long) 1);
		list.add((long) 1);
		list.add((long) 2);
		list.add((long) 2);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x < list.size()) {
				sb.append(list.get(x)).append('\n');
			}
			else {
				for (int j = list.size(); j <= x; j++) {
					list.add(j, list.get(j - 1) + list.get(j - 5));
				}
				sb.append(list.get(x)).append('\n');
			}
		}
		System.out.println(sb);
				
	}
}

