package Programmers;

public class JadenCase문자열만들기 {
	public String solution(String s) {
        String answer = "";
        String a = s.toLowerCase();
        String[] arr = a.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("")) {
                answer += " ";
                continue;
            }
            else {
                answer += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1) + " ";
            }
        }
        if (arr[arr.length - 1].equals("")) {
            answer += " ";
        }
        else if (s.substring(s.length() - 1).equals(" ")) {
            answer += String.valueOf(arr[arr.length - 1].charAt(0)).toUpperCase() + arr[arr.length - 1].substring(1) + " ";
        }
        else {
            answer += String.valueOf(arr[arr.length - 1].charAt(0)).toUpperCase() + arr[arr.length - 1].substring(1);
        }

        return answer;
    }
}
