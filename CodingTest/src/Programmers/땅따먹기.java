package Programmers;

public class 땅따먹기 {
	int solution(int[][] land) {
        int answer = 0;
        
        /*
         *  | 1 | 2 | 3 | 5 |

			| 5 | 6 | 7 | 8 |

			| 4 | 3 | 2 | 1 |
			
			-----------------
			
			| 1 | 2 | 3 | 5 |
			| 10| 11| 12| 11|
			| 16| 15| 13| 13|
			
         * */
        for (int i = 1; i < land.length; i++) {
        	land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
        	land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
        	land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
        	land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }
        
    	for (int x : land[land.length - 1]) {
    		answer = Math.max(answer, x);
    	}
        
        return answer;
    }
}
