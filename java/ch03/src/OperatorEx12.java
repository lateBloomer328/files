
public class OperatorEx12 {
	public static void main(String[] args) {
		//비교 연산자1
		//대소 비교연산자 -> 보다 크거나 작음 <,> ,~와 같거나 큼, 같거나 작음 <=, >= 반환 되는 값은 오직 boolean(true, false)이며, boolean을 제외한 모든 기본형 자료에서 사용할 수 있다
		//참조형에서는 사용할 수 없다.
		//등가 비교연산자 -> 좌우가 같음을 비교하는 ==, 좌우가 같지않음을 비교하는 != 같다는 의미의 =기호를 두번 쓰는 이유는 이미 변수에 값을 저장하는 기호로써 사용되고 있기 때문이다.
		//두개 이상의 비교연산자가 복합적으로 사용되는 경우 순서를 반대로 작성하거나 사이에 공백을 넣어서는 안된다 ex =>, > =
		System.out.printf("10 == 10.0f \t %b%n", 10 == 10.0f);
		System.out.printf("'0' == 0, \t %b%n", '0' == 0);
		System.out.printf("'A'+1 == 'B' \t %b%n", 'A'+ 1 == 'B');
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65);
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
}}