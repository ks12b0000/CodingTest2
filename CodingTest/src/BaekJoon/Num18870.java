package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}		
		
		int[] tmp = arr.clone();
		Arrays.sort(arr);
		int cnt = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
   	 	for(int i = 0; i < arr.length; i++) {
   	 		if(!map.containsKey(arr[i]))
   	 			map.put(arr[i], cnt++);
   	 	}
   	 	
   	 	for(int i = 0; i < n; i++) {
   	 		sb.append(map.get(tmp[i]) + " ");
   	 	}
   	 	
   	 	System.out.println(sb);
		
		br.close();
	}
}
