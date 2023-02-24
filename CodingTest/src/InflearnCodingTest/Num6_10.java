package InflearnCodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Num6_10 {
	public int count(int[] arr, int dist) {
		int cnt = 1; // 처음 말 마리 수
		int ep = arr[0]; // endpoint = arr배열에 처음 값
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= dist) { // arr[1 ~ arr길이 전] - ep가 mid보다 크거나 같으면
				cnt++; // cnt++
				ep = arr[i]; // ep는 arr[i]값 저
			}
		}
		return cnt;
	}
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); // arr을 정렬해줌
		int lt = 1; // lt = 1 
		int rt = arr[n - 1]; // rt = 마지막 값
		
		while (lt <= rt) {
			int mid = (lt + rt) / 2; // 중간값
			if (count(arr, mid) >= m) { // cnt(배치 가능한 말)가 m보다 크거나 같으면 후보 가능성 있음
				answer = mid; // answer에 mid값 넣어주고
				lt = mid + 1; // lt = mid + 1 저장  더 큰값에서 가능성 있는지 확인
			}
			else { // 아니면
				rt = mid - 1; // rt = mid - 1 저장
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_10 T = new Num6_10();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
		sc.close();
	}
}
