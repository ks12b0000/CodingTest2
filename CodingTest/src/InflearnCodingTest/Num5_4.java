package InflearnCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Num5_4 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '-' || x == '+' || x == '/' || x == '*') { // x가 -,+,*,/ 이면 
				int rt = stack.pop(); // rt에 stack제일 위에값 꺼내서 저장
				int lt = stack.pop(); // lt에 stack제일 위에값 꺼내서 저장
				if (x == '+') { // x가 +면 lt+rt 해줌 (2번째로 꺼낸 값이 앞으로와서 계산해야 되므로)
					stack.push(lt + rt); 
				}
				else if (x == '-') { // x가 -면 lt-rt
					stack.push(lt - rt);
				}
				else if (x == '*') { // x가 *면 lt*rt
					stack.push(lt * rt);
				}
				else if (x == '/'){// x가 /면 lt/rt
					stack.push(lt / rt);
				}
			}
			else { // 숫자로 들어가 있으면 stack에 char x를 int형으로 바꿔서 넣어줌.
				stack.push(Character.getNumericValue(x));
			}
		}
		answer = stack.get(0);
		
		return answer;
		/**
		  후위 표기법을 계산할 때는 다음의 절차를 따른다. 
		
		  1) 피연산자를 만나면 스택에 담는다.
		  2) 연산자를 만나면 스택에서 두 개의 연산자를 꺼내서 연산한 뒤에 그 결과를 스택에 담는다. 
		  3) 연산을 마치고 스택에 남아있는 하나의 피연산자가 연산 수행 결과이다. 
		 */
	}
	public static void main(String[] args) {
		Num5_4 T = new Num5_4();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}

}
