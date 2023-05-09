package Programmers;

import java.util.HashSet;

public class 소수찾기완전탐색 {	
	static HashSet<Integer> hashSet = new HashSet<Integer>();
	static boolean[] ch;
	public int solution(String numbers) {
		int answer = 0;
		ch = new boolean[numbers.length()];
		String[] arr = numbers.split("");
		
		DFS(arr, "");
        
		for (int num : hashSet) {
            if (sosu(num)) {
                answer++;
            }
        }
		
        return answer;
    }
	static void DFS(String[] arr, String str) {
		for (int i = 0; i < arr.length; i++) {
			if (!ch[i]) {
				str += arr[i];
				ch[i] = true;
				DFS(arr, str);
				str = str.substring(0, str.length() - 1);
				ch[i] = false;
			}
			else {
				hashSet.add(Integer.parseInt(str));
			}
		}
	}
	static boolean sosu(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
