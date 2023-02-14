package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Num0_27 {
	public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
        	if (array[i] >= n) { // array[i]가 n보다 크거나 같으면
        		int num1 = n - array[i - 1]; // num1에 n - array[i - 1] 저장
        		int num2 = array[i] - n; // num2에 array[i] - n 저장
        		
        		if (num1 > num2) { // 만약 num1이 num2보다 크면 array[i] return 
        			return array[i];
        		}
        		else if (num1 < num2) { // 만약 num2가 num1보다 크면 array[i - 1] return 
        			return array[i - 1];
        		}
        		else if (num1 == num2) { // 만약 num1이 num2랑 같으면 array[i - 1] return 
        			return array[i - 1];
        		}
        	}
        } // 해당X = array[array.length - 1] return
        answer = array[array.length - 1];
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_27 T = new Num0_27();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		System.out.println(T.solution(array, n));
		sc.close();
	}
}
