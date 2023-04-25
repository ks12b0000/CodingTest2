package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Num7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> hashSet = new HashSet<String>();
		String[] arr = new String[n];
		
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
			arr[i] = st.nextToken();
			String[] str = arr[i].split(" ");
			
			if (str[1].equals("enter")) {
				hashSet.add(str[0]);
			}
			else {
				hashSet.remove(str[0]);
			}
		}
		
		ArrayList<String> answer = new ArrayList<String>();
				
		for (String x : hashSet) {
			answer.add(x);
		}
		
		Collections.sort(answer, Collections.reverseOrder());
					
		for (String y : answer) {
			System.out.println(y);
		}
		
		br.close();
	}
}
