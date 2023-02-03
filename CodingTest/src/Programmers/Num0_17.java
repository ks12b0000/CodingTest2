package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num0_17 {
	public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");		// arr에 띄어쓰기 제거한 my_string을 저장
        answer = Integer.parseInt(arr[0]);			// answer에 0번째 값을 미리 저장해줌
        
        for (int i = 1; i < arr.length; i++) {		// 1번째 값부터 arr의 length 전 까지 
        	if(i%2!=0) {							// 만약 i번째가 1,3,5 홀수 자리일 때(이유는 홀수 자리가 +,- 로 이루어져 있으므로)
        		if (arr[i].equals("+")){			// arr[i]가 + 가 들어오면 
                    answer += Integer.parseInt(arr[i+1]);	// answer에 + 자리 다음 값을 더해줌  +자리 다음 값은 더해야 할 숫자 이므로
                } 
            	else {
                    answer -= Integer.parseInt(arr[i+1]);	// answer에 - 자리 다음 값을 빼줌    -자리 다음 값은 빼야 할 숫자 이므로
                } 
        	}   
        }
        // 이런식으로 푼 이유는 1+2 가 들어올 수 있지만 1+2+3+4 여러 수식이 들어올 수 있기 때문에.
        
        return answer;
    }
	public static void main(String[] args) throws IOException {
		Num0_17 T = new Num0_17();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
		String my_string = st.nextToken();
		System.out.println(T.solution(my_string));
		br.close();
	}
}
