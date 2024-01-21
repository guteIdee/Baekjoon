import java.util.*;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if(N < 100) {
        	System.out.println(N);
        }
        else {
        	int cnt = 99;
            for (int i = 100; i <= N; i++) {
    			int u = i % 10;
    			int t = i % 100 / 10;
    			int h = i / 100;
    			
    			if((h - t) == (t - u) || (u - t) == (t - h))
    				cnt++;
    		}
            System.out.println(cnt);
        }
        
        
        
	}
}
