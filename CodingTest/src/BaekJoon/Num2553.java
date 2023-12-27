package BaekJoon;

import java.util.Scanner;

public class Num2553 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        int N = sc.nextInt();
        System.out.println(fact(N) % 10);
        
        sc.close();
    }
    static long fact(int num) {
    	long answer = 1;
    	for (int i = 1; i <= num; i++) {
    		answer *= i;
    		answer %= 1000000000;
    		
    		while (answer % 10 == 0) {
    			answer /= 10;
    		}
    	}
    	return answer;
    }
}

