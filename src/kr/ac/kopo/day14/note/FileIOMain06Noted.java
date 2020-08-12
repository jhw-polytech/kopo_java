package kr.ac.kopo.day14.note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

public class FileIOMain06Noted {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		PrintWriter pw = null;
		
		
		try {
		
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03-1.java.txt");
			
			// 필터장착!
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			

			/* Lever 1
			 
			 
			 */
			
			
			/* Level 2
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				bw.write(str); // 여기까지만 하면 엔터 구분 없이 나온다. 엔터가 입력될 때 까지 입력받는데, 이 때 엔터는 저장이 안됨
				// bw.write('\n'); // 그런데 OS마다 엔터의 형식이 다르댔잖아! --> 이것을 보완한 게 newLine() 이다.
				bw.newLine();
			}
			*/
			
			
			
			// Level 3
			pw = new PrintWriter(fw);
			
			// CRUD Create Research U
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				pw.println(str);
			}
			
			pw.flush();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(br, bw);
			FileClose.close(fr, fw);

			/* 위에거랑 모가 다른거임...?
			FileClose.close(br, fr);
			FileClose.close(fr, fw);
			*/
			
			/*
			FileClose.close(br);
			FileClose.close(bw);			
			FileClose.close(fr);
			FileClose.close(fw);
			*/
			
		}
		
		
	}

}
