package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Num11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> PQ = new PriorityQueue<>((e1, e2) -> {
			if (Math.abs(e1) == Math.abs(e2)) {
				return e1 - e2;
			}
			else {
				return Math.abs(e1) - Math.abs(e2);
			}
		});
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if (a == 0) {
				if (PQ.isEmpty()) {
					System.out.println(0);
					continue;
				}
				else {
					System.out.println(PQ.poll());
					continue;
				}
			}
			else {
				PQ.add(a);
			}
		}
		
		br.close();
	}
}	
