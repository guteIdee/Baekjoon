import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ano = Integer.parseInt(st.nextToken());
		int bno = Integer.parseInt(st.nextToken());
				
		Set<Integer> A = new HashSet<>();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < ano; i++) {
			A.add(Integer.parseInt(st1.nextToken()));
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < bno; i++) {
			int ele = Integer.parseInt(st2.nextToken());
			if(A.contains(ele)) {
				A.remove(ele);
			}
			else {
				A.add(ele);
			}
		}
		System.out.println(A.size());
		
	}
}
