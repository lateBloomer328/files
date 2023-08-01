
public class OperatorEx06 {
	public static void main(String[] args) {
		//산술 연산자를 사용할 때 올바을 타입을 사용해야하는 이유, 또는 명시적 형변환이 필요한 이유
		byte a = 1, b = 2;
//		byte c = a + b; -> 이와 같이 사용하면 컴파일 오류가 발생한다. 이유는 a + b의 연산을 처리할 때 자동적으로 a와 b의 자료형이 int로 변환되기 때문이다. int형 자료는 byte에 담을 수 없기 때문에 오류가 발생한다.
		byte c = (byte)(a+b); //따라서 이와 같이 명시적 형변환을 해줘야 올바르게 a + b의 연산결과가 byte + byte로 되여 byte타입인 c에 저장될 수 있다.
		System.out.println(c);
		
		a = 10;
		b = 30;
		c = (byte)(a*b);
		System.out.println(c); //->자료형을 byte로 잘 명시했지만 결과가 300이 아닌 44로 표현됨 그 이유는 byte의 범위를 벗어나 오버플로우가 발생했기 때문이다.
		//따라서 계산결과를 고려해 자료형의 범위를 충분히 크게 설정해야한다.
	}
}
	