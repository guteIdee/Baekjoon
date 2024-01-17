import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int result = 0;
		
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N -1 ; j++) {
				for (int k = j + 1; k < N; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					
					if(temp == M) {
						result = temp;
						break;
					}
					if(result < temp && temp < M) {
						result = temp;
					}
				}
				
			}
		}
		System.out.println(result);
	}
	
}
