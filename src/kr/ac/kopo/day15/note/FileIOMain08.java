package kr.ac.kopo.day15.note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain08 {

	public static void write() {

		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		System.out.println(user);

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("iotest/userInfo.txt");
			bw = new BufferedWriter(fw);

			/*
			 * //bw.write(user); //오류나는 이유? write()에는 obj형 을 //bw.write(user.toString());
			 * bw.write(user.getName()); bw.write(user.getAge()); bw.write(user.getAddr());
			 * // 로드형은, 지금 당장 찍어봤을 때 글자가 깨져보여도 상관 ㄴㄴ 로드만 잘 되면 댐
			 * System.out.println("userInfo.txt에 저장완료...");
			 */

			// 인자들을 간편하게 가져오기 위해 '구분자'를 이용하는 방법이 있다.
			// 구분자를 공백으로 주는 것은 조금 위험함. 데이터에 따라서 공백이 포함된 데이터가 있을 수 있으니
			// 젤 쉬운건 엔터 / : 이런걸로 해도 된다. / 어떤 사람들은 키보드로 입력 못하는 ┌ 요런거를 구분자로 주는 사람들도 있음

			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}

	}

	public static void read() {
		UserInfo user = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);

			String data = br.readLine();
//			System.out.println(data);			

			String[] dataArr = data.split(":");

			System.out.println(Arrays.toString(dataArr));
			String name = dataArr[0];
			int age = Integer.parseInt(dataArr[1]);
			String addr = dataArr[2];
			user = new UserInfo(name, age, addr);

			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
		}
		
		

		System.out.println("");
	}

	public static void main(String[] args) {
		write();
		read();
	}

}
