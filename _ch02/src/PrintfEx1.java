
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printf와 println의 차이
		// println은 자동으로 개행되지만 표시형식을 임의로 지정할 수 없다.
		// printf는 지시자를 사용해서 출력값의 표시형식을 직접 지정할 수 있다
		// 지시자(formatter) - 출력형식을 지정하여 준다.
		/*
		 * 자주 쓰이는 Formatter
		 * %d - 10진수(decimal)
		 * %o - 8진수(octal)
		 * %x - 16진수(hexa-decimal)
		 * %b - boolean
		 * %f - 부동소수점(floating-point) - 기본적으로 소수점 이하 6자리까지만 출력한다
		 * %e, %E -지수(exponent)
		 * %c - 문자(character)
		 * %s - 문자열(string)
		 * %n - 시시자의 맨 뒤에 사용하여 개행한다.
		 */
		//정수관련 지시자(%d, %o, %x)
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15); //8진수 나 16진수를 출력할 때 지시자 앞에 #을 붙히면 구분기호까지 표시된다.
		System.out.printf("%#x%n", 15); // 8진수 : 017, 16진수:0xf
		System.out.printf("%s%n", Integer.toBinaryString(15));//2진수를 그대로 출력하는 지시자는 없지만, 정수를 2진수로 변환하여 문자열 형태로 표시할 수 있다.
		
		//실수관련 지시자(%f, %e, %g)
		float f = 123.456789f;
		System.out.printf("%f%n", f);//float형은 정밀도가 7이기 때문에 7자리까지만 올바르게 출력된다.
		System.out.printf("%e%n", f);//실수를 가수와 지수 형태로 표시한다.
		System.out.printf("%g%n", f);//실수를 7자리로 줄여 간략히 표기한다.
		
		double d = 123.456789;
		System.out.printf("%f%n", d);//double은 정밀도가 15이끼 때문에 모두 올바르게 출력된다.
		System.out.printf("%e%n", d);
		System.out.printf("%g%n", d);
	
		//자리수 지시자
		/*
		 * 지시자 앞에 정수를 사용하여 출력할 자리수를 지정할 수 있다
		 * %5d 왼쪽부터 다섯번째 자리까지 표시, 지정한 자리수>출력값의 자리수 -> 출력값을 제외한 나머지 공백
		 * %-5d 오른쪽부터 다섯번째 자리끼지 표시, 지정한 자리수>출력값의 자리수 -> 출력값을 제외한 나머지 공백 ->왼쪽 정력
		 * %05d 빈 자리수에 0을 채워 표시함
		 */
		//정수의 자리수 지시자
		System.out.printf("[%7d]%n", 17589); //[^^17589] ^ -> 공백표시
		System.out.printf("[%-7d]%n", 17589);//[17589^^]
		System.out.printf("[%07d]%n", 17589);//[0017589]
		System.out.printf("[%07d]%n", 175897888);//자리수를 지정했지만 자리수보다 출력값이 크다면 지정한 자리수는 무시하고 전체 출력값이 나온다.
		
		
		//실수의 자리수 지시자
		/*
		 * 실수는 표현 방식이 다름 -> %전체자리수.소수점아래자리수f로 표현한다.
		 */
		System.out.printf("%14.10f%n", 1.23456789);
		
		//문자열 자리수 지시자
		/*
		 * 정수와 비슷하게 작동하지만 지시자 앞에 .숫자를 붙히면 그 숫자 만큼의 문자열만 출력한다
		 */
		System.out.printf("%.4s%n", "skadbstjdqudtls");

		}
}