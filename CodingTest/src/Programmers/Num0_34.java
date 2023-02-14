package Programmers;


public class Num0_34 {
	public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for (int i = 0; i < db.length; i++) {
        	if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) { // id가 db[i][0] 번째 값이랑 같거나 pw가 db[i][1]값이 같으면 login
        		answer = "login";
        	}
            else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){ // id가 db[i][0]번째랑 같지만 pw가 db[i][1]값이랑 다르면 wrong pw
            	answer = "wrong pw";
            }
        }// 둘 다 아니면 fail
        
        return answer;
    }
}
