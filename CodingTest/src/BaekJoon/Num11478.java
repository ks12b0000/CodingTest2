package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Num11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> hashSet = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				hashSet.add(str.substring(i, j + 1));
			}
		}
		
		System.out.println(hashSet.size());
		
		br.close();
	}
}
