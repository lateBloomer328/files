
public class OperatorEx09 {
	public static void main(String[] args) {
		//char 타입의 연산특성1
		char a = 'A';
		char d = 'D';
		char one = '1';
		char three = '3';
		
		System.out.printf("%c - %c = %d%n", d, a, d - a);
		System.out.printf("%c - %c = %d%n", three, one, three - one);
		
		//문자는 입력한 그대로 저장되는 것이 아닌 그 문자에 맞는 유니코드가 정수형으로 저장된다. 따라서 문자를 출력할 때는 저장된 문자가 그대로 출력되는 것이 아닌
		//저장된 코드번호에 해당되는 유니코드 문자를 출력하는 것이다. 따라서 문자형 자료에 사칙연산이 가능한 것이다. 위의 변수에 해당하는 유니코드를 출력해보면 다음과 같다
		System.out.printf("%c = %d%n", a, (int)a);//'A' = 65
		System.out.printf("%c = %d%n", d, (int)d);//'B' = 68 
		System.out.printf("%c = %d%n", three, (int)three);//'3' = 51
		System.out.printf("%c = %d%n", one, (int)one);//'1' = 49
	}
}
	