package Programmers;

public class 비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] str = new String[n];
        char[][] ch = new char[n][n];
        for (int i = 0; i < arr1.length; i++) {           	
        	str[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
        }
        
        for (int i = 0; i < ch.length; i++) {
        	for (int j = 0; j < ch.length; j++) {
        		ch[i][j] = str[i].charAt(j);
        	}
        }
         
        for (int i = 0; i < arr2.length; i++) {
       		str[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));        	
   		}
       
        for (int i = 0; i < ch.length; i++) {
        	for (int j = 0; j < ch.length; j++) {
        		if (str[i].charAt(j) == '1') {
        			ch[i][j] = '1'; 
        		}
        	}
        }
 
        
        for (int i = 0; i < ch.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	for (int j = 0; j < ch.length; j++) {
        		if (ch[i][j] == '1') {
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
