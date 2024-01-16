import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int key = scanner.nextInt();
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}
	
	private static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		//lo가 hi랑 같아질 때 까지 반복
		while(lo < hi) {
			int mid = (lo + hi) / 2;	//중간위치를 구함
			
			if(key <= arr[mid]) {
				hi = mid;
			}
			
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	
	private static int upperBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}
