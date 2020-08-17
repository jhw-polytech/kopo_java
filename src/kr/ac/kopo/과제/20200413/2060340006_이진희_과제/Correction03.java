package te;

import java.util.Scanner;

public class mo04 {
   
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);   
			
			   int numArr[] = new int[5];
				 System.out.println("정수를 입력하시오");
				
				 for (int i=0; i<numArr.length; i++) {
					 numArr[i]=scan.nextInt();         //배열에 정수 입력받기 
					 scan.nextLine();

				System.out.println(i+1 + "번째 정수:" + numArr[i]);   //입력받은 정수 출력
				 
				  if(i>0 && numArr[i-1]>=numArr[i]) {          //입력받은 값이 이전값보다 작은 경우 실행
			           System.out.println("보다 큰수를 입력하세요");
			                i--;         
			                }
			           }
			          
				 System.out.println("\n <PRINT>");
				     for (int i=0; i<5; i++)                   
				  System.out.print( numArr[i] + " ");          //배열의 첫번째-다섯번째 값까지 출력
					
				 System.out.println("\n <REVERSE>");
				     for (int i=4; i>=0; i--) {
			                 int n10 = numArr[i] /10;
			                 int n1 = numArr[i] %10;
				  System.out.print( n1 *10 + n10 + " ");          //배열의 다섯번째부터 첫번째값까지 출력
					
				}
			            System.out.println();
			}
	}