
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수의 타입 : 변수에 어떤 값을 저장 하느냐에 따라 타입이 결정된다. 실수, 정수, 문자열 등등 따라서 알맞은 타입으로 변수를 선언해 주어야 한다.
		/*값의 타입
		 * 기본형
		 * 문자 - char 
		 * 숫자
		 * 		정수 - byte , short, int, long 저장하고자 하는 값의 크기와 용도에 따라 타입을 결정해 사용한다.
		 * 		실수 - float, double
		 * 논리 - boolean - true, false
		 * 
		 * 기본형 타입의 표현 크기
		 * ---------------------------------
		 * |자료형|1byte  |2byte|4byte|8byte | 1byte = 8bit = 2^8
		 * |논리형|boolean|     |     |      |
		 * |문자형|       |char |     |      |
		 * |정수형|byte   |short|int  |long  | -2^n-1 ~ (2^n-1)-1로 범위 계산(부호가 1bit를 차지하기 때문)
		 * |실수형|       |     |float|double| 
		 * ---------------------------------
		 * 실수형 범위
		 * ---------------------------------------
		 * |자료형  |값의 범위(양수)      |정밀도|크기byte|
		 * |float |1.4E-45~3.4E38   |7   |4      |부호(1byte) 지수(8byte) 가수(23byte) = 4byte(32bit)
		 * |double|4.9E-324~1.8E-308|15  |18     |부호(1byte) 지수(11byte) 가수(52byte) = 8byte(64bit)
		 * ---------------------------------------
		 * 
		 * 참조형
		 * -기본형을 제외한 나머지
		 * -메모리주소를 저장함 (4byte 최대 40억 ->4gb의 메모리를 다룰 수 있다. 또는 8byte 64비트 1600tb의 메모리를 다룰 수 있다.)
		 * -객체의 주소를 저장하기 위한 변수이다.
		 */
		//변수, 상수, 리터럴
		/*변수 : 하나의 값을 저장할 수 있는 공간 언제든지 저장된 값을 바꿀 수 있다.\
		 *상수 : 한 번만 값을 저장(초기화)할 수 있는 변수
		 *리터럴 : 그 자체로 값인 것
		 *
		 *int age = 10; -> 변수 age선언 후 10으로 초기화
		 *age = 100; -> 변수 age에 100을 저장
		 *final int Max = 100; -> final 키워드를 사용하여 정수 상수 Max를 선언후 100으로 초기화
		 *Max = 200; -> 상수이기 때문에 200을 저장할 수 없음 에러
		 *
		 *여기서 age는 변수 Max는 상수, 그외의 10, 100 ,200 등을 리터럴
		 *
		 *리터럴 추가 예시 
		 *char name = "JK park" -> JK park이 리터럴임
		 *int price = 10000 -> 10000이 리터럴
		 *
		 *리터럴의 접두사와 접미사
		 *논리형 없음
		 *정수형 L int의 경우 생략가능 8진수 0 16진수 0x 2진수 0b int => +-2,000,000,000
		 *실수형 f,d double 타입 생략 가능
		 *문자형 없음	 
		 *문자열 없음
		 *
		 *변수와 리터럴의 타입 불일치 -> 범위가 변수>리터럴 일 경우에는 타입이 일치하지 않아도 됨
		 *-> int i ='A'; -> int > char => 문자의 코드 65가 출력 
		 *-> long i = 123; -> long > int ...
		 *byte와 short 타입은 int에 저장
		 *범위가 변수<리터럴 일 경우에는 에러
		 **/
		final int score; //= 100;
		score = 200;
		boolean power = true;
		
		byte b = 127; // byte -> -128~127
		int oct = 010; // 8진수 8
		int hex = 0x10; // 16진수 16
		long l = 10000_000_000L;
		float f = 3.14f; //f생략 불가능
		double d = 3.14;
//		System.out.println(oct);
//		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);//기호e는 실수형에 사용되어서 실수로 출력 접미사가 없기 때문에 double 타입
		
		//문자와 문자열
		/*문자형은 ''안에 하나의 문자 char = 'A'; -> 아무런 문자도 저장되지 않으면 에러가 난다.
		 *문자열은 ""안에 단어나 문장 작성 string ="abc"; -> 문자가 하나이거나 하나도 없어도 된다.
		 *문자열과 문자열을 더하면 두 문자열이 결합된다.
		 *문자열과 숫자를 더하면 숫자가 문자열로 변환한 후 결합된다.
		 *문자열 결합은 왼쪽에서 오른쪽으로 진행 되기 때문에 순서에 따라 달라질 수 있다. 
		 *""+7+7 -> "7"+7 -> "7"+"7"
		 *7+7+"" > 14+"" -> "14"
		 */
		char ch = 'A';
		System.out.println(ch);
		int i = 'A'; //-> 문자 코드가 출력
		System.out.println(i);
		//문자열 예제
		String str = "";//빈 문자열 저장 가능
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;//두 문자열을 합치는 과정 ABCD123이 나올것이다.
		System.out.println(str4);
		//문자열 결합의 순서 왼쪽 -> 오른쪽
		System.out.println(""+7+7);//"77"출력
		System.out.println(7+7+"");//"14"출력
	}

}
