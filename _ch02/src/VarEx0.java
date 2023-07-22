

public class VarEx0 {
	public static void main(String[] args) {
		
		//변수 : 하나의 값을 저장할 수 있는 메모리 공간
		//하나의 변수에는 하나의 값만 저장 가능 새로운 값을 저장하면 이전 값은 사라짐
		//변수의 선언 : 변수타입 변수이름; -> int age; -> 정수 타입의 변수 age를 선언 -> age를 위한 공간을 메모리에서 할당 함
		int age;
		//변수의 값 저장하기 int age; age = 25; -> 좌항과 우항의 값이 같다는 것이 아닌 좌항에 우항의 값을 대입, 저장한다는 의미
		//변수의 선언과 동시에 초기화 : int age = 25; 
		//변수의 초기화 -> 변수의 선언후 처음으로 값을 저장하는 것
		age = 25;
		//지역 변수는 읽기전에 반드시 초기화 시켜줘야함
		//변수의 값 읽어오기 -> 변수의 값이 필요한 곳에 변수의 이름만 적으면 된다.
		age = age + 1;
//		System.out.println(age);//변수의 값을 출력
//		System.out.printf("binNum:%s%n", Integer.toBinaryString(i));
		char ch = 'A';//문자 A 저장 -> 유니코드 65(decimal)
		
		System.out.println(ch);//문자 그대로 출력
		System.out.printf("%c = %d(%X)%n", ch, (int)ch, (int)ch);//문자 : 유니코드(16진법)
		System.out.printf("%c = %s", ch, Integer.toBinaryString((int)ch));//문자 = 2진법 문자열
	}
}
