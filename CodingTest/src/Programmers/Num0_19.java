package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num0_19 {
	public int solution(String message) {
        int answer = 0;
        
        answer = message.length() * 2;		// 한 자 한 자를 가로2cm 크기로 적은다 했으니 전체 길이 * 2를 해주면 됨.
                
        return answer;
    }
	public static void main(String[] args) throws IOException {
		Num0_19 T = new Num0_19();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "\n");		// 문자열을 띄어쓰기 까지 포함해야 하므로 줄바꿈이 되기 전까지 하나의 문자열을 입력받음.
		String message = st.nextToken();
		System.out.println(T.solution(message));
		br.close();
	}
}
