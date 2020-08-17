package kr.ac.kopo.day04.homework;

/*
 * 2060340011 홍민기
 *  
 * 5. 2 ~ 100사이의 소수를 출력하는 코드를 작성
 * < 2 ~ 100사이의 소수 출력 >
 * 2 3 5 7 11 13 17 … 97
*/
public class HomeworkMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[101];
		
		for(int i=2;i<=100;i++) {
			arr[i]=i;
		}
		// 인덱스에 맞게 값을 넣어줍니다. arr[2]=2, arr[3]=3, ... , arr[100]=100
		
		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i=2;i<=100;i++) { // 2부터 100까지 소수들만 출력합니다
			if(arr[i]!=0) { // 27Line 에서 소수가 아닌 수들은 0으로 만들었기 때문에 0이 아니면 소수고 출력합니다.
				System.out.print(arr[i]+" ");
				for(int j=i;i*j<=100;j++) { // i의 배수는 i*2, i*3 , ... , i*j인데 최대값이 100이므로 i*j<=100까지만 반복을 수행하면 됩니다. 
					arr[i*j]=0; // 현재 i값의 배수들은 소수가 아니므로 수들을 0으로 만듭니다.
				}
			}
		}
	}

}
