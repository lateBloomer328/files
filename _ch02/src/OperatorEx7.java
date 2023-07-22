
public class OperatorEx7 {
	public static void main(String[] args) {
		//산술 연산자를 사용할 때 올바을 타입을 사용해야하는 이유, 또는 명시적 형변환이 필요한 이유2
		int a = 1_000_000, b=2_000_000;
		long c =a*b;
		System.out.println(c); // 계산 결과가 int 범위를 벗어나지만 그보다 큰 long 자료형에 담기기 때문에 문제가 없어 보인다 하지만 결과는 2_000_000_000_000 2조가 아닌 -1454759936
		//그 이유는 이미 계산이 끝난 후에 c에 저장되기 때문이다 int * int = int 이다. 따라서 이미 오버플로우가 발생한 후이기 때문에 long형에 저장 된다고 해도 우리가 원하는 값을 반환 할 수 없다
		//피연산자 중 하나를 long 형으로 변환하거나 둘 다 long형으로 변환해야 한다.
		c = (long)a * b;
		System.out.println(c);//a의 타입을 long으로 명시적 변환 해주었기 때문에 올바른 결과를 반환한다.
		
		//비슷하지만 다른 예도 있다
		long d = 1_000_000 * 1_000_000;
		long e = 1_000_000 * 1_000_000L;
		
		System.out.println("d="+d);
		System.out.println("e="+e);
		//d의 결과는 오버플로우 e의 결과는 올바르게 나왔다. 이 이유는 리터럴타입이 잘못 되었기 때문이다. 기본적으로 정수 리터럴은 int형이기 때문에 접미사를 사용하지 않으면
		//int로 취급된다 따라서 d 의 계산식은 int * int = int 이기 때문에 1조는 이 범위를 벗어나 오버플로우가 발생할 수 밖에 없다. 
		//e의 경우에는 뒷쪽의 피연산자에 long형 접미사 L을 사용했기 때문에 int * long -> long * long = long 형이 되어 올바른 결과가 나올 수 있는 것이다.
	}
}
	