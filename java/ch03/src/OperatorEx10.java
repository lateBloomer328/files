
public class OperatorEx10 {
	public static void main(String[] args) {
		//char 타입의 연산 특성
		char a1 = 'a';
		char a2 = a1;
		char a3 = ' ';
		
		int i = a1 + 1; // (char)97 + (int)1 = (int)98
		a3 = (char)(a1 + 1);
		a2++;
		a2++;
		
		System.out.println("i = " + i); //98출력 -> int형과 연산되어서 int형에 저장 되므로 int형 유니코드 출력
		System.out.println("a2 = " + a2); //단순 증감연산자로 2증가 하므로 형변환이 없음 유니코드 99인 c 출력
		System.out.println("a3 = " + a3); //연산결과는 int형이지만 char형으로 형변환을 해줬기 때문에 char타입에 저장되어 b 출력
	}
}