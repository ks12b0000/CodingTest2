package InflearnCodingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Num6_5 {
	public String solution(int n, int[] arr) {
		String answer = "U";
		
		// 방법1
//		for (int i = 0; i < n - 1; i++) { // 0 ~ n-1 전까지
//			for (int j = i + 1; j < n; j++) { // i + 1 ~ n 전까지
//				if (arr[i] == arr[j]) { // 만약 arr[0 ~ n-1 전]이랑 arr[i+1 ~ n전] 값이 같은게 있으면 return D;
//					return "D";
//				}
//			}
//		}
		
		// 방법2	
//		HashSet<Integer> hashSet = new HashSet<>();		
//		for (int i = 0; i < n; i++) { // hashSet에 arr값들을 다 담아줘서 중복 제거.
//			hashSet.add(arr[i]);
//		}
//		
//		if (hashSet.size() != arr.length) { // 중복이 제거 되었으므로 hashSet사이즈랑 arr의 길이랑 다르면 중복되었던게 있었던거임.
//			return "D";
//		}
		
		
		// 방법3
		Arrays.sort(arr); // arr배열을 정렬해주고
		
		for (int i = 0; i < n - 1; i++) { // 0 ~ n - 1 전까지
			if (arr[i] == arr[i + 1]) { // 만약 arr[i]랑 arr[i + 1]이랑 값이 같으면 return D (정렬해줘서 바로 다음값이 같은지 확인)
				return "D";
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_5 T = new Num6_5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, arr));
		sc.close();
	}
}
