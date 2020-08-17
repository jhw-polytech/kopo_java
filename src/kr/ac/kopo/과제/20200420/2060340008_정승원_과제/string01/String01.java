package kr.ac.kopo.day07.project.string01;


public class String01 {


    public static int checkChar(String strData, char ch) {
        int searchIdx = -1;
        int answer = 0;
        // 이 값이 -1이 아닌 경우 loop를 돌라는 뜻이다.
        while ((searchIdx = strData.indexOf(ch, searchIdx+1)) != -1) {
            answer++; // 발견하면 answer을 하나 늘려준다.
        }

        return answer;
    }

}
