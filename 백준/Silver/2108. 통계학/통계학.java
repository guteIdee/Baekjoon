import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		List<Integer> maxList = new ArrayList<>();
		double sum = 0;
		int max = 1;
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			list.add(x);
			map.put(x, map.getOrDefault(x, 0) + 1);
			sum += x;
			max = Math.max(max, map.get(x));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(Math.round(sum / n) + "\n");
		sb.append(list.get(n / 2) + "\n");
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max) {
				maxList.add(entry.getKey());
			}
		}
		
		Collections.sort(maxList);
		if(maxList.size() > 1) {
			sb.append(maxList.get(1) + "\n");
		}
		else {
			Collections.sort(maxList);
			sb.append(maxList.get(0) + "\n");
		}
		
		sb.append(Math.abs(list.get(0) - list.get(list.size() - 1)));
		
		System.out.println(sb);
		
	}
}