package kr.ac.kopo.assignment.day08;

public class Square extends Figure {
	
	Square(){
		
	}
	
	Square(int length){
		super(length);
	}
	
	public double getArea() {
		
		//교수님 처음에는 이런식으로 코드를 짜니 StackoverflowError가 뜨는데 이유를 잘 모르겠습니다..ㅠ

		/*
			리턴없이요?? 아님 리턴 있게 하셨나????
			이 자체로는 문제가 없어보이는데....
			리턴을 뭘했어요???? 설마 getArea() 아닐거 같고.............
			알려주세요~~ ^^
		*/

		//double area = getLength() * getLength();
		//setArea(area);
		return (double)getLength() * getLength();
		
	}


}
