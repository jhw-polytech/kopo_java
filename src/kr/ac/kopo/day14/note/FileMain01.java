package kr.ac.kopo.day14.note;

import java.io.File;

/*
	디렉토리 관련된 것
*/

public class FileMain01 {
	
	
	public static void main(String[] args) {
		File dirObj = new File("iotest");
		
		boolean bool = dirObj.exists()	;
		System.out.println(bool ? "유효한 디렉토리입니다" : "유효하지 않은 디렉토리입니다");
		
		String[] list = dirObj.list(); //참고* dirObj.list()의 리턴타입 - String 배열
		System.out.println("------------------------------------------------");
		System.out.println("\t" + dirObj.getName()+ "의 디렉토리 정보");
		System.out.println("------------------------------------------------");
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("------------------------------------------------");
		
		// 새 폴더 생성
		File newDirObj = new File("iotest/하마");
		System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패"); //생성했으면 true, 못했으면 false 반환
		// 성공했어도, 실시간 연동이 아니라서 IDE 파일트리에서 F5 한번 해줘야 보일것임
		// 생성 후에 다시 메소드를 실행하면, 이미 있는 놈이 다시 생성될 수 없으므로 실패로 뜰 것임
		
		newDirObj = new File("iotest/나비/오리");
		System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패"); // 중간경로(나비)가 없으면 생성되지 않음
		System.out.println(newDirObj.mkdirs() ? "dir 생성 성공" : "dir 생성 실패"); // mkdirs() 라고 s가 붙으면 중간경로까지 생성 가능
		
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패");
		
		// 단위가 항상 child쪽이었다. ?????
		
		
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패"); //실패라고 뜸 >> 삭제하려는 폴더가 비어있을 때만 삭제 가능
		
		
	}
	
	
}
