//package BaekJoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Num10986 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		int[] arr = new int[n];
//		int[] arr2 = new int[n];
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			int sum = 1;
//			for (int j = 1; j <= arr[i]; j++) {
//				sum *= n;
//			}
//			arr2[i] = sum;
//		}
//
//		int cnt = 0;
//		for (int i = 0; i < n; i++) {			
//			for (int j = i + 1; j < n; j++) {
//				System.out.println("arr2[i] = " + (arr2[i] + arr2[j]));
//				if ((arr2[i] + arr2[j]) % m == 0) cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
//		
//		br.close();
//	}
//}
// 다시 풀어야됨.
