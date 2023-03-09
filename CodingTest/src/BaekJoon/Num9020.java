package BaekJoon;

import java.util.Scanner;

public class Num9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int key = gold(num);
            System.out.println(key + " " + (num - key));
        }	
		sc.close();
	}
	public static boolean prime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
	}
	// 주어진 값에서 소수의 합을 찾는 메소드
    public static int gold(int num) {
        int key = 0;

        // 중복되는 연산을 줄이기 위해 num/2
        for (int i = num / 2; i >= 0; i--) {
            // 우선 i가 소수이고
            if (prime(i)){
                // (주어진 수 - 소수)가 다시 소수이면 값을 저장
                if (prime(num - i)){
                    // 많은 골드바흐 파티션 중 두 수의 차이가 가장 작은 수는
                    // num/2 부터 탐색했을 때 처음 찾은 두 수가 소수일 때
                   key = i;
                   break;
                }
            }            
        }
        return key;
    }
}
