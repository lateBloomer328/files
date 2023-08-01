
public class OperatorEx11 {
	public static void main(String[] args) {
		//나머지 연산자 %
		int a = 5;
		int b = 2;
		System.out.printf("%d(피제수)를 %d(제수)로 나누면%n", a, b);
		System.out.printf("몫은 %d이고 나머지는 %d이다.%n", a / b, a % b);
		//나머지 연산자는 제수로 피제수를 나눈뒤 몫을 제외한 나머지 부분이다. 배수나, 홀수, 짝수인지 식별하는데 사용되기도 한다.
		//나머지 연산자는 부호를 구분하지만 피제수의 부호만으로 나머지의 부호를 결정한다. 제수의 부호는 무시된다.
		System.out.println(-10 % 8);//-2
		System.out.println(10 % 8);//2
		System.out.println(-10 % -8);//-2
		
	}
}