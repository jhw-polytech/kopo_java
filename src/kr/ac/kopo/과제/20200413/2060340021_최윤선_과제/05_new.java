int[] iptarr = new int[99]; 
		for (int i=0 ; i<99 ; i++) { // 1부터 num까지 돌리는 반복문
			iptarr[i]=i+2;
		}
		
		/*
			윤선씨.. 이렇게 만들면 nums[3] = 0일 때도 for문을 무조건 돌아요....
			if(num != 0) 을 for(int j = i+1) 위쪽으로 올려주는 것이 더  좋은 코드입니다!!!!
		*/
		for (int i=0 ; i<99 ; i++) {
			int num=iptarr[i];
			for (int j=i+1 ; j<99 ; j++) {
				if((num !=0) &&( iptarr[j]%num==0)) {
					iptarr[j]=0;
				}
			}
		}
		
		System.out.println("2~100 까지의 소수 출력");
		for (int i=0 ; i<99 ; i++) {
			if(iptarr[i]!=0) {
				System.out.printf("%d ",iptarr[i]);
			}
		}