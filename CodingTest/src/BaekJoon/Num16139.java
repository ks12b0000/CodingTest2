package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num16139 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int num = Integer.parseInt(br.readLine());	
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
					
			for (int j = b; j <= c; j++) {
				if (n.charAt(j) == a.charAt(0)) cnt++;
			}
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
