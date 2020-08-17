package kr.ac.kopo.day03;

import java.util.Scanner;

public class No2Fix {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("초를 입력하세요 :");
        int time = sc.nextInt(); //초 선언
        sc.nextLine();

        int hour = time / 3600;  // 시간 설정
        int min = time % 3600 / 60;  // 분 설정
        int sec = time % 3600 % 60;  // 초 설정

        /*
            성주씨 이렇게 조건을 걸게 되면 hour 가 0일 때, 즉 954초 입력하면 0시간 나오지 않나요????
            조건을 다시한번 조정해주세요. ^^
        
        => 수정했습니다!
        
        */
        
        // 수정한 소스
        if (hour > 0) {
        	System.out.print(hour + "시간 ");
        }
        if (min > 0) {
        	System.out.print(min + "분 ");
        }
        if (sec > 0) {
        	System.out.print(sec + "초 ");
        }
        
        if (time <= 0) {
        	System.out.print("설정된 시간이 없습니다.");
        }

        
        // 틀린 소스
//        if (min == 0 && sec == 0) {  //분과 초 값이 모두 0일 경우
//            System.out.printf("%d시간", hour);
//        } else if (min == 0) {  //분 값이 0일 경우
//            System.out.printf("%d시간 %d초", hour, sec);
//        } else if (sec == 0) {  //초 값이 0일 경우
//            System.out.printf("%d시간 %d분", hour, min);
//        } else {  //시간, 분, 초 값이 모두 0이 아닐 경우
//            System.out.printf("%d시간 %d분 %d초", hour, min, sec);
//        }
    }

}
