import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int last = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				queue.add(x);
				last = x;
			}
			else if(str.equals("pop")) {
				if(queue.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(queue.poll()).append('\n');
			}
			else if(str.equals("size")) {
				sb.append(queue.size()).append('\n');
			}
			else if(str.equals("empty")) {
				if(queue.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
			}
			else if(str.equals("front")) {
				if(queue.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(queue.peek()).append('\n');
			}
			else if(str.equals("back")) {
				if(queue.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(last).append('\n');
			}
			
		}
		System.out.println(sb);
	}
}
