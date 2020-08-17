package homework10;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 * 교수님 질문이 있습니다!!
		 *
		 * 1.여기 아래에서 Shape shape = new Shape()는 오류가 나더라구요.
		 * 아무래도 어제 말씀해주셨던것처럼 추상클래스는 new로 생성못한다고..? 했던 부분때문인것같은데,
		 * 그럼 Shape.java에 있는 generate메소드를 사용하기위해서는 어떤방식으로 생성을 해줘야 하나요?
		 * 이런 저런 시도 끝에 제가 그나마 성공한 방식이 아래와 같은 방법입니다.
		 * 제가 사용한것처럼 코드를 작성해도 괜춘한것인지, 그리고 제가 형변환을 이해한건지 너무 아리송합니다...'ㅁ'
		 * 숙제에 대한 리뷰할때 이 부분을 꼭 알고싶어욥...ㅠ^ㅠ
		 *  => 답변
		      generate()는 도형을 선택해서 면적을 구하는 메소드 아니에요?? 이게 왜 Shape 클래스에 작성되었을까요?
			  main()이나 제어클래스내에 정의도어있어야 할거 가타용.. Shape클래스가 꼭 도형면적만 구하진 않을거자나요
		 *
		 *
		 *
		 * 2.그리고 제가 만든 shape.java도 컨트롤클래스..? 라고 말할 수 있는걸까요??.....
		 *    아니요...... 컨트롤클래스면 안됩니다.
		      눈에 보이는 사물(직사각형, 삼각형등등)을 만드는 추상클래스이지 않습니까??? ^^
		 *
		 */
		
		
		Shape shape = new Rectangle();
		shape.generate();
	}

}
