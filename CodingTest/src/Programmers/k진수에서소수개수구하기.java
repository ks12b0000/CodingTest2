package Programmers;

public class k진수에서소수개수구하기 {
	public int solution(int n, int k) {
        int answer = 0;
        
        String a = Integer.toString(n, k);
        
        if (!a.contains("0")) {
        	if (sosu(Long.parseLong(a))) {
        		return 1;
        	}
        	else {
        		return 0;
        	}
        }       
        
        long start = Long.parseLong(a.substring(0, a.indexOf('0')));
        long end = Long.parseLong(a.substring(a.lastIndexOf('0') , a.length()));

        for (int i = a.indexOf('0'); i < a.lastIndexOf('0'); i++) {
        	if (a.charAt(i) == '0') {
        		for (int j = i + 1; j < a.lastIndexOf('0') + 1; j++) {
        			if (a.charAt(j) == '0') {
        				long mid = Long.parseLong(a.substring(i, j));
        				String c = String.valueOf(mid);

                        if (sosu(mid) && !c.contains("0")) {
        					answer++;
        				}
        			}
        		}
        	}
        }
        if (sosu(start)) {
        	answer++;
        }
        if (sosu(end) && end != 0) {
        	answer++;
        }
        
        return answer;
    }
	static boolean sosu(long num) {
		if (num < 2) return false;
		
		for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
	}
}
