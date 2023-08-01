
public class OperatorEx15 {
	public static void main(String[] args) {
		//논리 연산자 ||(OR), &&(AND) !(NOT)
		//조건식에서는 boolean 또는 결과 값이 boolean인 조건식만 사용 가능
		//OR 조건식 중 하나만 참이어도 true를 반환함
		//AND 조건식 모두 참이어야 true를 반환함
		//NOT 참이면 거짓을 거짓이면 참을 반환함 - 논리 부정 연산자
		//OR 예시 2의 배수 또는 3의 배수인지 확인
		int a = 0;
		char ch = ' ';
		a = 8;
		System.out.printf("%d은(는) 2또는 3의 배수인가?\t%b%n", a, a % 2 == 0 || a % 3 == 0);
		a = 7;
		System.out.printf("%d은(는) 2또는 3의 배수인가?\t%b%n", a, a % 2 == 0 || a % 3 == 0);
		//AND 예시 2의 배수 또는 3의 배수 이고 6의 배수는 아닌 것
		a = 10;
		System.out.printf("%d은(는) 2또는 3의 배수 이고 6의 배수가 아닌가?\t%b%n", a, (a % 2 == 0 || a % 3 == 0) && a % 6 != 0);
		a = 12;
		System.out.printf("%d은(는) 2또는 3의 배수 이고 6의 배수가 아닌가?\t%b%n", a, (a % 2 == 0 || a % 3 == 0) && a % 6 != 0);
		// 위 식에서 AND연산자가 OR연산자보다 우선순위가 높아 먼저 연산되기 때문에 원하는 결과를 얻으려면 OR연산자에 괄호를 쳐야한다.
		// AND 예시 문자ch가 숫자인지 판단하기
		ch = '3';
		System.out.printf("문자 ", arg);
		
	}
}