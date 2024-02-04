import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		List<Boolean> primeList = new ArrayList<>();
		
		primeList.add(false);
		primeList.add(false);
		
		for (int i = 2; i <= N; i++) {
			primeList.add(true);
		}
		
		for (int i = 2; i <= N; i++) {
			if(primeList.get(i)) {
				for (int j = i; j <= N ; j += i) {
					if(primeList.get(j)) {
						primeList.set(j, false);
						K--;
					}
					if(K == 0) {
						answer = j;
						break;
					}
				}
			}	
		}
		System.out.println(answer);
	}
}

