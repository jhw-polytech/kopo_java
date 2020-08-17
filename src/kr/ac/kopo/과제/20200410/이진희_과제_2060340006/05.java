package chap1;

public class pr5 {
	//다음의 설명을 보고 코드를 작성하세요
	//달팽이가 100m 깊이의 우물을 빠졌습니다.
	//달팽이는 1시간에 5m속도로 움직입니다.
	//올라온 높이가 50m미만일땐 1시간에 1m씩 미끌어지고
//	         50m이상일때 1시간에 2m씩 미끌어집니다.
	//달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요 
	//<출력결과>
	//[1시간후] 달팽이가 올라간 총 높이: 4m
	//[2시간후] 달팽이가 올라간 총 높이: 8m
	//... [x시간후] 달팽이가 올라간 총 높이: 100m or 101m or 102m
	public static void main(String[] args){

		
		int height=0;         //높이(깊이), 시간, 속도 저장 
	    int time=0;
	    int v =5;             //시간당 5m속도로 움직이므로      

	    
	    for(time=1; height<=100 ; time++) {
	       
	       if(height<50) 
	          height=height+v-1;  //v-1 , 1m씩 미끌어짐
	       
	       else                           //높이가 50m 이상일 떄 
	          height=height+v-2;  //v-2 , 2m씩 미끌어짐 
	       
	       System.out.printf(" [%d시간후] 달팽이가 올라간 총 높이 : %dM \n", time, height);
	  
	    }
	   }
	}

