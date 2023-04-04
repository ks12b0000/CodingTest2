package Programmers;


public class 공원산책 {
	public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] park2 = new char[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
        	for (int j = 0; j < park[i].length(); j++) {
        		park2[i][j] = park[i].charAt(j);
        		if (park2[i][j] == 'S') {
        			answer[0] = i;
        			answer[1] = j;
        		}
        	}
        }
        for (String str : routes) {
        	char way = str.charAt(0);
        	int len = Character.getNumericValue(str.charAt(2));
        	
        	int ny = answer[0];
        	int nx = answer[1];
        	
        	for (int i = 0; i < len; i++) {
        		if (way == 'N') {
        			ny--;
        		}
        		if (way == 'S') {
        			ny++;
        		}
        		if (way == 'W') {
        			nx--;
        		}
        		if (way == 'E') {
        			nx++;
        		}
        		if(nx >= 0 && ny >= 0 && ny < park2.length && nx < park2[0].length){
                    if(park2[ny][nx] == 'X'){
                        break;
                    }
                    if(i == len - 1){
                        answer[1] = nx;
                        answer[0] = ny;
                    }
                }
        	}
        }
        
        return answer;
    }
}
