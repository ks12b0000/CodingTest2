package InflearnCodingTest;


/* 1번 방법 (n이 커지면 커질수록 재귀가 엄청 많이 뻗어 나가기 때문에 너무 오래걸린다.)*/
//public class Num7_4 { // 피보나치 재귀
//	public int DFS(int n) {
//		if (n == 1) { // DFS(1),DFS(2)는 고정적으로 1임
//			return 1;
//		}
//		else if (n == 2) {
//			return 1;
//		}
//		else {
//			return DFS(n - 2) + DFS(n - 1); // DFS(n - 2)번째 값이랑 DFS(n - 1)번째 값이랑 더한 값이 다음 값이 됨.
//		}
//	}
//	public static void main(String[] args) {
//		Num7_4 T = new Num7_4();
//		int n = 10;
//		for (int i = 1; i <= n; i++) { // DFS(1 ~ 10) 까지 출력
//			System.out.print(T.DFS(i) + " ");
//		}
//	}
//}
//
/* 2번 방법 (1번 방법보다는 개선되었지만, 처음 출력시에 배열에 저장시키는 시간이 오래걸려서 n이 커질수록 오래걸림.)*/
//public class Num7_4 { // 피보나치 재귀
//	static int[] fibo; // int[] 배열을 만들어줘서 출력해주는 방법.
//	public int DFS(int n) {
//		if (n == 1) { // DFS(1), DFS(2)는 고정적으로 1이므로 fibo[n]에 저장해줌
//			return fibo[n] = 1;
//		}
//		else if (n == 2) {
//			return fibo[n] = 1;
//		}
//		else {
//			return fibo[n] = DFS(n - 2) + DFS(n - 1); // fibo[n]에 DFS(n - 2)번째 값이랑 DFS(n - 1)번째 값이랑 더한 값 저장
//		}
//	}
//	public static void main(String[] args) {
//		Num7_4 T = new Num7_4();
//		int n = 10;
//		fibo = new int[n + 1]; // DSF는 1번째 부터 시작하므로 배열0번째는 버림
//		T.DFS(n); // DFS(n)을 한번만 호출해줘서
//		for (int i = 1; i <= n; i++) { // fibo배열에 있는 값들을 출력해줌
//			System.out.print(fibo[i] + " ");
//		}
//	}
//}


/* 3번 방법 (if조건 하나만 더 추가한 3번 방법을 사용하니 n값이 커져도 이제는 1초안에 값이 출력된다.) */
public class Num7_4 { // 피보나치 재귀
	static int[] fibo;
	public int DFS(int n) {
		if (fibo[n] > 0) { // fibo[n]이 0보다 크면 이미 구했던 값임.
			return fibo[n]; // 바로 fibo[n]값 return
		}
		if (n == 1) {
			return fibo[n] = 1;
		}
		else if (n == 2) {
			return fibo[n] = 1;
		}
		else {
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}
	}
	public static void main(String[] args) {
		Num7_4 T = new Num7_4();
		int n = 45;
		fibo = new int[n + 1];
		T.DFS(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
