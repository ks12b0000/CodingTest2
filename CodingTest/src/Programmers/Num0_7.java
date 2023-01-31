package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num0_7 {
	public int solution(int[] array) {					// ex) 7, 77, 17
        int answer = 0;
        String str = "";
        for (int i = 0; i < array.length; i++) {		// 0 ~ 2 까지
        	str += String.valueOf(array[i]);			// str += array[0 ~ 2] 번째 값들을 String으로 변환 후 저장, 77717
        }
        
        for (int i = 0; i < str.length(); i++) {		// 0 ~ 5 str 길이 만큼 반복
        	if(str.charAt(i) == '7') {					// 만약 str(0 ~ 5) 번째 문자가 7 이면 answer 1씩 증가
        		answer++;
        	}
        }
        
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_7 T = new Num0_7();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] array = new int[num];
//		for (int i = 0; i < num; i++) {
//			array[i] = sc.nextInt();
//		}
//		System.out.println(T.solution(array));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_7 T = new Num0_7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] array = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(array));
		br.close();
	}
}
