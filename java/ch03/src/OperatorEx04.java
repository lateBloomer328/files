public class OperatorEx04 {
	public static void main(String[] args) {
		//부호 연산자 -,+ 
		//부호 연산자 -는 현재 쓰인 부호를 반대로 변경하는 결과를 반환한다 양수 -> 음수, 음수 -> 양수 반면 부호 연산자 +는 아무런 역할을 하지 않는다
		int i = -10;
		i = +i;
		System.out.println(i);//양의 부호 연산자는 아무런 영향을 미치지 못하므로 그대로 -10이 출력됨
		i=-10;
		i=-i;
		System.out.println(i);//음의 부호 연산자는 현재 부호를 반대로 변경하므로 10이 출력됨
	}
}
	