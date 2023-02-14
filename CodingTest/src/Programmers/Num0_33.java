package Programmers;

import java.util.Scanner;

public class Num0_33 {
	
	// 방법1
//	public int solution(int chicken) {
//        int answer = -1;
//
//        int a = chicken / 10; // 처음 서비스 받은 치킨 개수
//        int b = chicken % 10; // 처음 서비스 치킨 받고 남은 쿠폰 개수
//        int num = a; // 일단 num에 처음 서비스 받은 치킨 개수 저장
//        while (a + b > 9) { // a + b가 9보다 크면 반복(10장 이상 서비스 치킨 받을 수 있기 때문)
//        	int c = ((a + b) / 10); // c에 받을 수 있는 서비스 치킨 개수 저장            
//            int d = ((a + b) % 10); // d에 서비스 치킨 받고 남은 쿠폰 개수 저장
//            num += c;  // num에 서비스 받은 치킨 개수 더해줌
//            a = c; // a = 서비스 받은 치킨 개수(이걸로 쿠폰 받기 가능)
//            b = d; // b = 서비스 치킨 받고 남은 쿠폰 개수
//        }      
//        
//        
//        answer = num;
//        
//        return answer;
//    }
	
	// 방법2
	public int solution(int chicken) {
		int answer = 0;
		
		while (chicken > 9) { // chicken이 9보다 크면
			int a = chicken / 10; // a = 서비스 치킨 개수
			int b = chicken % 10; // b = 남은 쿠폰 개수
			
			chicken = a + b; // chicken = 쿠폰개수
			answer += a; // answer에 서비스 받은 치킨 개수 더해줌
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Num0_33 T = new Num0_33();
		Scanner sc = new Scanner(System.in);
		int chicken = sc.nextInt();
		System.out.println(T.solution(chicken));
		sc.close();
	}
}
