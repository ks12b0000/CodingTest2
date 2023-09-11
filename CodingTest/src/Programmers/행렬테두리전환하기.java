package Programmers;

public class 행렬테두리전환하기 {
	static int[][] arr;
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        arr = new int[rows + 1][columns + 1];
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = cnt++;
            }
        }
        
        for (int i = 0; i < queries.length; i++) {
            answer[i] = change(queries[i]);
        }
        
        return answer;
    }
    static int change(int[] queries) {
        int x1 = queries[0];
        int y1 = queries[1];
        int x2 = queries[2];
        int y2 = queries[3];
                
        int tmp = arr[x1 + 1][y1];
        int min = tmp;
        int tmp1;
        
        for (int i = y1; i <= y2; i++) {
        	tmp1 = arr[x1][i];
        	arr[x1][i] = tmp;
        	tmp = tmp1;
        	min = Math.min(min, tmp);
        }
        
        for (int i = x1 + 1; i <= x2; i++) {
        	tmp1 = arr[i][y2];
        	arr[i][y2] = tmp;
        	tmp = tmp1;
        	min = Math.min(min, tmp);
        }
        
        for (int i = y2 - 1; i >= y1; i--) {
        	tmp1 = arr[x2][i];
        	arr[x2][i] = tmp;
        	tmp = tmp1;
        	min = Math.min(min, tmp);
        }
        
        for (int i = x2 - 1; i >= x1; i--) {
        	tmp1 = arr[i][y1];
        	arr[i][y1] = tmp;
        	tmp = tmp1;
        	min = Math.min(min, tmp);
        }
    	        
    	return min;
    }
}
