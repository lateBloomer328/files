
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 변수의 값을 서로 바꾸는 방법
		/*
		 * 두 변수 x,y의 값을 서로 바꾸기 위해서는 하나의 빈 변수가 더 필요하다.
		 * 빈 변수를 tmp로 선언한 후 x의 값을 저장한 뒤 x에 y값을 저장한다.
		 * y에 원래의 x값이 저장된 tmp를 저장하면 서로 치환된 모습을 볼 수 있다.
		 */
		int x = 4, y = 2;
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		//위와 같이 변수를 활용한다면, x값과 y값만 수정하면 된다.
	}

}
