package kr.ac.kopo.day07.project.string02;

public class String02 {

    public static String removeChar(String oriStr, char delChar) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < oriStr.length(); i++) { // for문을 돌면서,
            char comp = oriStr.charAt(i); // 인덱스에 해당하는 문자와
            if (delChar != comp) { // 입력받은 문자를 비교하고,
                sb.append(oriStr.charAt(i)); // 입력받은 문자와 다를경우 sb에 append 해준다.
            }
        }

        return sb.toString();
    }

}
