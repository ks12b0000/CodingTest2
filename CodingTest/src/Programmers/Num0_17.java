//package Programmers;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Num0_17 {
//	public int solution(String my_string) {
//        int answer = 0;
//        String[] arr = my_string.split(" ");
//        answer = Integer.parseInt(arr[0]);
//        
//        for (int i = 1; i < arr.length; i++) {
//        	if(i%2!=0) {
//        		if (arr[i].equals("+")){
//                    answer += Integer.parseInt(arr[i+1]);
//                } 
//            	else {
//                    answer -= Integer.parseInt(arr[i+1]);
//                } 
//        	}   
//        }
//        
//        
//        return answer;
//    }
//	public static void main(String[] args) throws IOException {
//		Num0_17 T = new Num0_17();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
//		String my_string = st.nextToken();
//		System.out.println(T.solution(my_string));
//		br.close();
//	}
//}
