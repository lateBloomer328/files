
public class OperatorEx13 {
	public static void main(String[] args) {
		//비교 연산자2
		//실수형에서의 비교 연산자
		float f = 0.1f;
		double d1 = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f ? %b%n", 10.0 == 10.0f);
		System.out.printf(" 0.1 ==  0.1f ? %b%n", 0.1 == 0.1f);
		System.out.printf("f  = %19.17f%n", f);
		System.out.printf("d1 = %19.17f%n", d1);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d1==f	%b%n", d1 == f);
		System.out.printf("d1==d2	%b%n", d1 == d2);
		System.out.printf("d2==f	%b%n", d2 == f);
		System.out.printf("(float)d1==f	%b%n", (float)d1 == f);
//		결과
//		10.0 == 10.0f ? true				
//		 0.1 ==  0.1f ? false				10.0은 오차없이 저장가능, 하지만 0.1과 0.1f는 저장할 때 근사값으로 저장해 정밀도에 따라 오차가 상이하여 서로 다른값으로 출력
//				 f  = 0.10000000149011612 -> 근사값으로 저장되여 정밀도 이하에서 값이 다름
//				 d1 = 0.10000000000000000 
//				 d2 = 0.10000000149011612 -> double 타입으로 형변환해도 처음 float에 저장된 값은 변하지 않고 그대로 double로 자료형만 변환됨
//				 d1==f	false -> 위에 설명하듯이 서로 다름을 출력
//				 d1==d2	false -> 마찬가지로 형변환이 되더라도 이미 flaot에 저장된 값이 변환 된 것 이므로 다름을 출력
//				 d2==f	true -> 상기 이유로 같음을 출력
//				 (float)d1==f	true ->반대로 double타입을 float에 넣을 때는 정밀도가 떨어지기 때문에 근사값도 변하여 저장됨
	
}}