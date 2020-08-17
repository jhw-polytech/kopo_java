package jaeheehomework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cmd {
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
   Scanner sc = new Scanner(System.in);

   //시작 파일 : MyCmd 폴더
   File myCmdDir = new File("MyCmd");
   
   //현재의 경로를 저장. 행위 할때마다 업데이트 할것임
   String nowPath = myCmdDir.getPath();
   File updatedDir = new File(nowPath);
     
   //폴더 정보를 저장하는 list
   File[] list = myCmdDir.listFiles();
   
      
  
   
   //폴더생성. 
   public void createFolder() {
      
      //폴더 이름 받기
      System.out.println("생성할 폴더의 이름을 입력하세요 :");
      String newFolderName = sc.nextLine();
      
      //폴더 만들기. 현재 폴더 위치에 생성한 폴더 이름      
      File newDirObj = new File( nowPath +"/" + newFolderName );
      System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패");
     
      //현재 위치 업데이트
      this.nowPath = nowPath + "/" + newFolderName;
      this.updatedDir = new File(nowPath);
      
      nowPathInfo();
   }
   
   
   
   //삭제
   public void deleteFolder() {
      
      // 삭제 후, 경로 업데이트
	  updatedDir.delete();
      this.nowPath = updatedDir.getPath();
      this.updatedDir = new File(nowPath);
      
      nowPathInfo();
   }
   
   
   
   //상위폴더이동
   public void goUp() {
      this.nowPath = updatedDir.getParent();
      this.updatedDir = new File(nowPath);
      
      // nowPath의 저장 디렉토리 정보 보여주기
      nowPathInfo();
      
   }
   
   // 하위이동폴더이동  
   public void goDown() {
	   
      boolean bool = false;
      while (bool == false) {
         System.out.println("하위폴더 이름을 입력하시오 : ");
         String downFolderName = sc.nextLine();

         this.nowPath = this.nowPath + "/" + downFolderName;
         this.updatedDir = new File(nowPath);

         bool = updatedDir.exists();
         System.out.println(bool ? "유효한 디렉토리입니다" : "유효하지 않는 디렉토리입니다. 다시입력하세요");
      }
      //nowPath의 저장 디렉토리 정보 보여주기
      nowPathInfo();
   }
   
   
   //이름수정
   public void changeName() {
	   
	   System.out.println("변경할 파일을 선택하세요");
	   String nowName = sc.nextLine();
	   
	   this.nowPath = this.nowPath + "/" + nowName;
	   this.updatedDir = new File(nowPath);
	   
	   System.out.println("수정할 파일이름을 적으세요");
	   String newName = sc.nextLine();
	   File reFolder = new File(newName);
	   updatedDir.renameTo(reFolder);
	   
	   nowPathInfo();
   }
   
   
   //종류
   public String kind(String name) {
	   if(name.contains("txt")) {
		   return "파일";
	   } else {
		   return "DIR";
	   }
   }
   
   
   // nowPath의 파일 정보
   public void nowPathInfo() {
      System.out.println("----------------------------");
      System.out.println("\t" + updatedDir.getName() + " 폴더 정보");
      System.out.println("----------------------------");
      System.out.println("이름\t\t종류\t\t크기\t\t마지막수정날짜");
      
      for(File folder:updatedDir.listFiles()) {
         
         System.out.printf("%s \t\t %s \t\t %d \t\t %s", 
        		 	       folder.getName(), kind(folder.getName()), folder.length(), sdf.format(new Date(folder.lastModified())) );
         System.out.println();
      }    
   }
   
   //현재 저장 디렉토리, 파일 가져오기(이름, 종류, 크기, 마지막 저장 날짜)
   public void allInfo() {
	   File[] list = myCmdDir.listFiles();
	   
      for(File folder:list) {
         System.out.printf("%s \t\t %s \t\t %d \t\t %s", 
        		 			folder.getName(), kind(folder.getName()), folder.length(), sdf.format(new Date(folder.lastModified())) );   
         System.out.println();
      }
   }
   
}
