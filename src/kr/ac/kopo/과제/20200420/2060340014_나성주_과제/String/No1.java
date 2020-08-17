package homework.day07String;

public class No1 {

    // 문자열에서 특정 문자의 개수를 찾는 메소드
    public static int checkChar(String strData, char ch) {

        int cnt = 0;    // ch 개수 카운트
        int tempStart = strData.indexOf(ch);    // 문자열 내 다음 ch가 나타나는 인덱스

        if (tempStart == -1) {  // ch가 아예 나타나지 않았다면 cnt = 0
            cnt = 0;
        } else {    // ch가 한 번 이상 나타나면 나타날 때마다 cnt++
            cnt += 1;   // ch가 한 번 이상 나타남이 확실하기에 우선 cnt = 1
            while (true) {
                if (strData.indexOf(ch, tempStart + 1) == -1) { // tempStart 이후의 인덱스에서 ch가 더이상 나타나지 않으면 while문을 멈춤
                    break;
                } else {
                    cnt += 1;
                    tempStart = strData.indexOf(ch, tempStart + 1); // ch가 나타나는 다음 인덱스 설정
                }
            }
        }
        return  cnt;
    }


    // 문자열에서 특정 문자를 제거하는 메소드 (너무 복잡하게 짠 듯한 코드...)
    // oriStr = 대상 문자열, delChar = 삭제할 문자
    public static String removeChar(String oriStr, char delChar) {


        String removedStr = ""; // delChar이 삭제된 문자열 (단계별로 늘어갈 예정)
        int tempStart = oriStr.indexOf(delChar);    // 문자열 내 다음 delChar이 나타나는 인덱스

        if (tempStart == -1) {  // delChar이 없으면 oriStr 그대로 리턴
            removedStr = oriStr;
        } else {    // delChar이 하나라도 있을 경우
            while (true) {
                if (tempStart == -1) {  // oriChar에 다음 delChar이 더이상 존재하지 않을 때
                    removedStr += oriStr;   // 마지막으로 나타난 delChar 이후의 oriStr을 removedStr에 붙여주고 while문을 마침
                    break;
                } else {    // oriChar에 다음 delChar이 존재할 때
                    removedStr += oriStr.substring(0,tempStart);    // removedStr에 delChar이 나타나기 이전의 문자열을 이어줌
                    oriStr = oriStr.substring(tempStart+1); // oriStr을 delChar을 기준으로 잘라주기
                    tempStart = oriStr.indexOf(delChar);    // temp는 다음 delChar의 인덱스
                }
            }
        }
        return removedStr;
    }


    // 위의 메소드를 설계하다보니 다른 방식의 코딩 방법이 떠올랐다...
    // 어차피 delChar 문자를 기준으로 oriStr 문자열을 나누는 것이 중요한 것이기 때문에 split 메소드로 문자열을 나누어 주면 됐었다!!

    // 문자열에서 특정 문자를 제거하는 메소드2
    public static String removeChar2(String oriStr, char delChar) {

        String[] removedArr = oriStr.split(Character.toString(delChar));    // 문자를 문자열로 변환.. 이건 안배운 메소드 같은데 왠지 있을것 같아서 찾아보았다...
        String removedStr = "";
        for (int i = 0; i <= removedArr.length-1; i++) {
            removedStr += removedArr[i];
        }
        return removedStr;
    }
    // 코드길이가 훨씬 짧아졌다 !!
}