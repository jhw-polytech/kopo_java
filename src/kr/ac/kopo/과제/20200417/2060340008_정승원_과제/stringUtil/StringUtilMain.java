package kr.ac.kopo.day06.project.stringUtil;

public class StringUtilMain {

    public static void main(String[] args) {

        StringUtil stringUtil = new StringUtil();

        Boolean ans1;
        ans1 = stringUtil.isUpper('a');
        System.out.println(ans1);
        ans1 = stringUtil.isUpper('A');
        System.out.println(ans1);

        ans1 = stringUtil.isLower('b');
        System.out.println(ans1);
        ans1 = stringUtil.isLower('A');
        System.out.println(ans1);

        int ans2;
        ans2 = stringUtil.max(1,2);
        System.out.println(ans2);
        ans2 = stringUtil.min(1,2);
        System.out.println(ans2);

        String ans3;
        ans3 = stringUtil.reverseString("안녕하세요.");
        System.out.println(ans3);


        ans3 = stringUtil.toUpperString("aasBBddd");
        System.out.println(ans3);
        ans3 = stringUtil.toLowerString("aasBBddd");
        System.out.println(ans3);


    }
}
