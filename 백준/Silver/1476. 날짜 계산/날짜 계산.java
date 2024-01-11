import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int E = scanner.nextInt();
		int S = scanner.nextInt();
		int M = scanner.nextInt();
		
		int n = 1;
		
		if(E == 15) E = 0;
		if(S == 28) S = 0;
		if(M == 19) M = 0;
		
		while(true) {
			if(n % 15 == E && n % 28 == S && n % 19 == M)
				break;
			else
				n++;
		}
		System.out.println(n);
	}
}
