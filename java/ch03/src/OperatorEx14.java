
public class OperatorEx14 {
	public static void main(String[] args) {
		//비교 연산자3 문자열의 비교
		//문자열을 생성하는 방법에는 두가지가 있음
		String str1 = "park";
		String str2 = new String("park");
		String str3 = "park";
		//string은 기본형 자료 같지만 엄현이 객체로 참조형 자료임 따라서 새로운 객체를 선언하는 방식을 사용해야 하지만 예외적으로 변수 선언과 같이 쓸 수 있음
		//string을 비교 할 때는 ==연산자를 쓰는 것이 아닌 equals()메서드를 사용해야함 equals()메서드는 문자열의 내용을 비교해 true와 false로 반환함
		
		System.out.printf("\"park\" == \"park\"  ? %b%n", "park" =="park"); 
		System.out.printf("\"abc\" == str1  ? %b%n", "park" == str1);
		System.out.printf("\"abc\" == str2  ? %b%n", "park" == str2);//내용은 같지만 서로 다른 객체이기에 false출력
		System.out.printf("str1 == str2  ? %b%n", str1 == str2);
		System.out.printf("str1 == str3  ? %b%n", str1 == str3);//객체 선언문으로 작성하지 않은 경우에는 true로 출력됨
		System.out.printf("str1 == str2  ? %b%n", str1.equals("park"));
		System.out.printf("str1 == str2  ? %b%n", str2.equals("park"));
		//위 결과를 볼때 String을 선언하는 방식이 두가지가 있어 어떤 것을 사용할지 모르기 때문에 equals()메서드를 이용해서 비교하는 것이 좋다.
}}