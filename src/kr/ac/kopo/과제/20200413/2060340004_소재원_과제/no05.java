package exam0413;

public class no05 {

	public static void main(String[] args) {
		
		int arr[] = new int[99];
		//arr[0]~arr[99]까지 2~100 입력.
		for (int i = 2; i < arr.length; i++) {
			arr[i-2] = i;
		}
        /*
         * 0 1 2 3 4 5 6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28
         * 2 3 4 5 6 7 8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
         */
		
		//0이 아닌 값이 나올 경우, 소수이기 때문에 출력.
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
				
				// arr[arr[i]*j-2] = 0의 뜻은, 소수의 배수를 제거하기 위한 식.
				// 소수를 *2 *3 *4씩 하면서 배수를 제거해주는 것인데, 그 값의 인덱스는
				// 소수의 값 * 배수에서 2를 뺀 인덱스에 존재한다.
				for (int j = 2; arr[i]*j-2 < arr.length; j++) {
					arr[arr[i]*j-2] = 0;
				}
			}
		}
	}
}
