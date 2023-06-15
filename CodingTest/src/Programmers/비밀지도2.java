package Programmers;

public class 비밀지도2 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];        
        
        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            str = "0".repeat(n - str.length()) + str; // n - str.length()가 0이 안나오면 "0"을 n - str.length()만큼 반복해서 넣어주고 + str해줌.
            str2 = "0".repeat(n - str2.length()) + str2;
            
            String[] binary1 = str.split("");
            String[] binary2 = str2.split("");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
            	if (binary1[j].equals("1") || binary2[j].equals("1")) {
            		sb.append("#");
            	}
            	else {
            		sb.append(" ");
            	}
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
