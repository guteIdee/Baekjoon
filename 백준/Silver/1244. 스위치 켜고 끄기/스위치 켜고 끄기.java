import java.io.*;
import java.util.*;


public class Main {
	static int swap(int a) {
		if (a == 0)
			a = 1;
		else {
			a = 0;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int j = 1; j <= n; j++) {
			arr[j] = Integer.parseInt(st.nextToken());
		}
		
		int x = Integer.parseInt(br.readLine());
		
		for (int y = 0; y < x; y++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st1.nextToken());
			int no = Integer.parseInt(st1.nextToken());
			if(sex == 1) {
				for (int j = no; j <= n; j += no) {
					arr[j] = swap(arr[j]);
				}
			}
			else {
				arr[no] = swap(arr[no]);
				for (int j = 1; j < arr.length; j++) {
					if(no - j >= 1 && no + j <= n) {
						if(arr[no - j] == arr[no + j]) {
							arr[no - j] = swap(arr[no - j]);
							arr[no + j] = swap(arr[no + j]);
						}
						else {
							break;
						}
					}
					else {
						break;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int z = 1; z <= n; z++) {
			if(z == n) {
				sb.append(arr[z]);
			}
			else if(z % 20 == 0) {
				sb.append(arr[z]).append('\n');
			}
			else {
				sb.append(arr[z] + " ");
			}
			
		}
		System.out.print(sb);
				
	}
}

