package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num0_12 {
	public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {				
        	String[] str = quiz[i].split(" ");				// str 배열에 quiz[i] 에서 띄어쓰기를 지우고 저장해줌.
        	
        	if (str[1].equals("-")) {						// 만약 str[1] 자리에 - 가 들어왔을 때 str[0] - str[2] == str[4] 가 나오면 answer[i] 자리에 "O" 넣어줌
        		if (Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
        			answer[i] = "O";
        		}
        		else {						// 위에 식이 맞지 않으면 answer[i]에 "X" 넣어줌
        			answer[i] = "X";
        		}
        	}
        	else if (str[1].equals("+")) {					// str[1] 자리에 + 가 들어왔을 때 str[0] + str[2] == str[4] 가 나오면 answer[i] 자리에 "O" 넣어줌
        		if (Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
        			answer[i] = "O";
        		}
        		else {						// 위에 식이 맞지 않으면 answer[i]에 "X" 넣어줌
        			answer[i] = "X";
        		}
        	}
        }
        
        
        return answer;
    }
	public static void main(String[] args) throws IOException{
		Num0_12 T = new Num0_12();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] quiz = new String[num];
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");	// StringTokenizer로 입력한 String 값을 ,로 구분해줌.(, 가 들어오면 다음 값 입력)
		for (int i = 0; i < num; i++) {
			quiz[i] = st.nextToken();
		}
		for (String x : T.solution(quiz)) {
			System.out.print("\"" + x + "\"");
		}
		br.close();
	}
}
