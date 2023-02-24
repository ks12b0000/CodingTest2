package InflearnCodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Num6_9 {
	public int count(int[] arr, int capacity) {
		int cnt = 1; // dvd 장수
		int sum = 0; // 곡들의 합
		for (int x : arr) { // arr값들을 x에 넣어주면서
			if (sum + x > capacity) { // sum + x가 mid값보다 크면
				cnt++; // cnt++
				sum = x; // sum = x로 저장해줌
			}
			else { // 아니면 sum에 x값들 더해
				sum += x;
			}
		}
		return cnt;
	}
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); // arr배열에서 가장 큰 값을 Arrays.stream.max로 찾아주고 max는 int형이 아니라 int형으로 바꿔줌
		int rt = Arrays.stream(arr).sum(); // arr배열의 값들의 합을 구해줌
		
		while(lt <= rt) { // lt가 rt보다 같거나 작으면
			int mid = (lt + rt) / 2; // 2분탐색 이 값이 한장의 용량이라고 결정(중간 값)
			if (count(arr, mid) <= m) { // dvd 장수가 m 보다 작거나 같으면
				answer = mid; // answer에 mid 값을 넣어주고
				rt = mid - 1; // rt는 mid - 1해서 저장해줌
			}
			else { // m보다 크면 lt는 mid + 1해서 저장
				lt = mid + 1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num6_9 T = new Num6_9();
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
