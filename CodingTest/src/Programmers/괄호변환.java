package Programmers;

import java.util.Stack;

public class 괄호변환 {
	// 처음 푼 풀이
//	public String solution(String p) {
//        String answer = "";
//        
//        if (check(p)) return p;
//        answer = separation(p);
//        
//        return answer;
//    }
//    static boolean check(String w) {
//        boolean flag = false;
//        if (w == "") return flag;
//        Stack<Character> stack = new Stack<>();
//        
//        for (int i = 0; i < w.length(); i++) {
//            if (w.charAt(i) == '(') {
//                stack.push('(');
//            }
//            else if (!stack.isEmpty()) {
//                stack.pop();
//            }
//        }
//        
//        if (stack.isEmpty()) flag = true;
//        
//        return flag;
//    }
//    static String separation(String p) {
//        String tmp = "";
//        if (p.equals("")) return "";
//        int left = 0;
//        int right = 0;
//        String u = "";
//        String v = "";
//        
//        for (int i = 0; i < p.length(); i++) {
//            if (p.charAt(i) == '(') {
//                left++;
//            }
//            else {
//                right++;
//            }
//            u += p.charAt(i);
//            if (left == right) {
//                v += p.substring(i + 1, p.length());
//                break;
//            }
//        }
//        String str = "";
//        String str2 = "";
//        if (check(u)) {
//            tmp += u + separation(v);
//        }
//        else {
//            str2 = u.substring(1, u.length());
//            str2 = str2.substring(0, str2.length() - 1);
//            String reverse = "";
//            for (int i = 0; i < str2.length(); i++) {
//            	if (str2.charAt(i) == '(') {
//            		reverse += ")";
//            	}
//            	else {
//            		reverse += "(";
//            	}
//            }
//            tmp += "(" + separation(v) + ")" + reverse;
//        }
//        return tmp; 
//    }
	
	// 코드 정리한 풀이
	public String solution(String p) {
        String answer = "";
        
        if (check(p)) return p;
        answer = separation(p);
        
        return answer;
    }
    static String separation(String p) {
        String tmp = "";
        if (p.equals("")) return "";
        
        String[] arr = split(p);
        String u = arr[0];
        String v = arr[1];
        
        if (check(u)) {
            tmp += u + separation(v);
        }
        else {
            tmp += "(" + separation(v) + ")" + reverseString(u);
        }
        return tmp; 
    }
    static boolean check(String w) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') {
                stack.push('(');
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
                
        return stack.isEmpty();
    }
    static String reverseString(String u) {
    	u = u.substring(1, u.length());
        u = u.substring(0, u.length() - 1);
        String reverse = "";
        for (int i = 0; i < u.length(); i++) {
        	if (u.charAt(i) == '(') {
        		reverse += ")";
        	}
        	else {
        		reverse += "(";
        	}
        }
        return reverse;
    }
    static String[] split(String p) {
    	int left = 0;
        int right = 0;
        String u = "";
        String v = "";
        
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }
            u += p.charAt(i);
            if (left == right) {
                v += p.substring(i + 1, p.length());
                return new String[] {u, v};
            }
        }
        return new String[] {u, v};
    }
}
