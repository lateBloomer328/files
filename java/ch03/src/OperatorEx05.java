
public class OperatorEx05 {
	public static void main(String[] args) {
		//산술 연산자
		int a=25, b=10;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);// int + int = int
		System.out.printf("%d - %d = %d%n", a, b, a-b);// int - int = int
		System.out.printf("%d * %d = %d%n", a, b, a*b);// int * int = int
		System.out.printf("%d / %d = %d%n", a, b, a/b);// int / int = int -> 소수점 이하 버림
		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);// int / float = float -> 더 범위가 큰 실수형으로 자동변환
		//정수형 타입에 산술 연산자 / 를 사용할 때 나누는 수로 0을 사용하면 컴파일은 되지만 오류가 뜬다
		//실수형 타입에 /를 사용할 때 나누는 수로 0.0을 사용하면 infinity(무한대)가 된다.
	}
}
	