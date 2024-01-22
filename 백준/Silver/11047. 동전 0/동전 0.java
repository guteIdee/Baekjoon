import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		int y = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			list.add(x);
			
			if(x <= K) {
				y = i;
			}
		}
		
		int count = 0;
		for (int i = y; i >= 0; i--) {
			if(K == 0) {
				break;
			}
			count += K / list.get(i);
			K = K % list.get(i);
		}
		System.out.println(count);
	}
}
