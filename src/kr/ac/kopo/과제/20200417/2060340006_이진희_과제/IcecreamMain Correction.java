import java.util.Scanner;

public class IcecreamMain {
	
	  public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);

      System.out.println("아이스크림 몇개 구입할래?");
      int num = scan.nextInt();
      
      icecream[] ice= new icecream[num];
      
      for(int i=0; i<num; i++) {
         System.out.println("***"+(i+1)+"번째 아이스크림 구매정보 ***");
         System.out.print("아이스크림 명 : ");
         String name = scan.next();
         System.out.print("아이스크림 가격 : ");
         int price = scan.nextInt();
         
         ice[i]= new icecream(name, price);
         
         System.out.println();
      }
      
      System.out.println("< 총 "+num+"개의 아이스크림 구매정보 출력 >");
      System.out.println("번호\t아이스크림명"+"\t"+"아이스크림가격");
      for(int i=0; i<num ; i++) {
         System.out.print((i+1)+"\t");
         ice[i].print();
         
      }  
   }
   
