
public class OperatorEx08 {
	public static void main(String[] args) {
		//산술 연산자를 사용할 때 올바을 타입을 사용해야하는 이유, 또는 명시적 형변환이 필요한 이유3
		int a = 1000000;
		int result1 = a * a / a; // 1000000 * 1000000 / 1000000
		int result2 = a / a * a; // 1000000 / 1000000 * 1000000

		System.out.println(result1);
		System.out.println(result2);
		// 일반적인 산술 논리로는 위 두 결과는 같아야 한다. 하지만 result1 = -727 result2 = 1000000 으로 결과가 상이하다. 
		// 그 이유는 자바가 산술 연산자를 처리하는 방식에 있다. 나누기와 곱하기의 연산 처리 우선순위는 같기 때문에 왼쪽에서 오른쪽으로 계산해 나간다.
		// result1 -> 1000000 * 1000000을 먼저 처리 1000000000000(1조로 이미 int형의 표현범위를 넘어서 오버플로우 발생) -> 오버플로우된 값 / 1000000 -> -727
		// result2 -> 1000000 / 1000000을 먼저 처리 -> 1 * 1000000 -> 1000000으로 int형의 표현범위를 넘어서지 않아 오버플로우가 발생하지 않음
	}
}
	