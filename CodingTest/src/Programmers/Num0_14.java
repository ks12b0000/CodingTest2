package Programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Num0_14 {
	public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();			// int[] answer = {} 에서 몇개의 배열을 저장할지 아직 몰라서 ArrayList로 바꿔서 풀었음.
        
        for (int i = 0; i < numlist.length; i++) {
        	if (numlist[i] % n == 0) {							// numlist[i] 값을 % n 했을 때 0이 나오면 배수이므로 answer에 numlist[i] 값을 넣어줬음.
        		answer.add(numlist[i]);
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num0_14 T = new Num0_14();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = sc.nextInt();
		int[] numlist = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			numlist[i] = sc.nextInt();
		}
		for (int x : T.solution(n, numlist)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
