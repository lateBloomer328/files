
public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6+3);
		System.out.println(6-3);
		System.out.println(6*3);
		System.out.println(6/3);
		//위 사직연산에서 6과 3을 4와 2로 바꾸고 싶다. 하나씩 바꿀 수 있지만, 변수를 활용하면 불필요한 반복 작업을 없엘 수 있다.
		int x = 4, y = 2;
		System.out.println();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		//위와 같이 변수를 활용한다면, x값과 y값만 수정하면 된다.
	}

}
