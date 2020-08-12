package kr.ac.kopo.day15.note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

/*
	콘솔에서 명령어를 입력하여 원본파일을 대상파일에 저장하는 프로그램
	$	java	FileIOMain07	aaa.txt		bbb.txt
*/
public class FileIOMain07 {

	// 프로그램을 실행하는 순간 호출되는 메소드
	public static void main(String[] args) {

		/*
		 *** args: 무슨 내용을 받았는지 기억하는 역할
		 * 
		 * $ java FileIOMain07 aaa.txt bbb.txt 라는 명령어가 있을 때, 앞의 java FileIOMain07 빼고
		 * aaa.txt bbb.txt 부분만 저장됨
		 */

		// 원래 지금까지는 args에 들어온 것이 없었다.
		// Run> Run Configuration> 현재 돌고있는 파일> 탭 중에 Arguments 에 파일 두 개를(a.txt b.txt)라고
		// 적어보면
		// length가 2로 찍히는 것을 볼 수 있다.
		System.out.println("args length : " + args.length);


		
		// 현재 args에 두 개의 파일이 들어가기로 되어 있는데,
		// 데이터 개수를 체크하여 유효성 검사
		if (args.length < 2) {
			System.out.println("명령구문이 잘못되었습니다.");
			System.out.println("java FileIOMain07 원본파일명 복사대상파일명");
			System.exit(0);
		}


//		System.out.println(Arrays.toString(args)); //args에 들어있는 파일들 확인

		// iotest/a.txt iotest/b.txt 라고 경로를 정확히 입력하고 실제로 파일이 존재한다면, 제대로 출력될 것임
		File oriFile = new File(args[0]);
		if (!oriFile.exists()) {
			System.out.println("[" + args[0] + "] 파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
//			fr= new FileReader(args[0]);
			fr = new FileReader(oriFile);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(args[1]);
			bw = new BufferedWriter(fw);

			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			
			System.out.printf("[%s] -> [%s] 복사완료\n", args[0], args[1]);
			
		} catch (FileNotFoundException e) {
			System.out.println("["+ args[0] + "] 파일이 존재하지 않습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}

	}

}
