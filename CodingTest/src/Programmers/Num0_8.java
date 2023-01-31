package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Num0_8 {
	public String solution(String my_string) {
        String answer = "";
//        my_string = my_string.toLowerCase();
//        char[] arr = my_string.toCharArray();
        char[] arr = my_string.toLowerCase().toCharArray();		// char 배열 arr 에 my_string을 소문자로 변환하고 문자로 나열해서 저장
        
        Arrays.sort(arr);					// Arrays.sort로 arr을 순서대로 나열
        
        answer = String.valueOf(arr);		// answer에 arr을 String으로 변환 후 저장
        
        return answer;
    }
//	public static void main(String[] args) {
//		Num0_8 T = new Num0_8();
//		Scanner sc = new Scanner(System.in);
//		String my_string = sc.next();
//		System.out.println(T.solution(my_string));
//		sc.close();
//	}
	public static void main(String[] args) throws IOException {
		Num0_8 T = new Num0_8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String my_string = br.readLine();
		System.out.println(T.solution(my_string));
		br.close();
	}
}
