package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num0_6 {
	public String[] solution(String my_str, int n) {	// ex.) my_str = abcdefg, n = 2
		int cnt = my_str.length() / n;					// cnt = my_str의 길이 / n 만큼 지정  7 / 2 = 3
		if (my_str.length() % n > 0) {					// 만약 my_str의 길이 % n 이 0보다 크면 cnt를 1 증가 , 7 % 2 = 1
			cnt++;										// cnt = 4
		}
        String[] answer = new String[cnt];      		// answer 배열에 cnt 만큼 저장가능,  new String[4]
        
        for (int i = 0; i < cnt - 1; i++) {				// 0 ~ cnt-1 전 까지 반복,    0 ~ 2 까지 반복
        	String a = my_str.substring(0, n);			// a = my_str.substring(0, n) 저장,   a = my_str.substring(0, 2)  ab,cd,ef 
            my_str = my_str.substring(n);				// my_str = n까지 자름,   my_str = cdefg, my_str = efg, my_str = g
        	answer[i] = a;								// arr[i] = a값	, arr[0] = ab, arr[1] = cd,  arr[2] = ef 
        }
        
        answer[cnt - 1] = my_str;						// answer[cnt-1] (마지막 배열은 따로 저장) = 남은 my_str 값  answer[3] = g
               
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_6 T = new Num0_6();
//		Scanner sc = new Scanner(System.in);
//		String my_str = sc.next();
//		int n = sc.nextInt();
//		for(String x : T.solution(my_str, n)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_6 T = new Num0_6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String my_str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		for (String x : T.solution(my_str, n)) {
			System.out.println(x + " ");
		}
		br.close();
	}
}
