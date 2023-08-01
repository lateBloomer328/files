 public class OperatorEx03 {
	public static void main(String[] args) {
		//메서드에서 증감 연사자를 호출 할 경우 전위, 후위의 차이
		int i = 0, j = 0;
		System.out.println("i=" + i++);//후위 증감 연산자를 메서드에서 호출
		System.out.println("j=" + ++j);//전위 증감 연산자를 메서드에서 호출
		//호출 후 저장된 값
		System.out.println("i=" +i+ " ,j=" +j);
		
		// 전위, 후위 증감 연사자를 메서드에서 호출 했을때의 과정
		i = 0;
		j=0;
		System.out.println(i);// 출력 후 
		i++;// 증가
		j++;// 증가 후
		System.out.println(j);// 출력
		
		//증감 연산자가 한 식에 여러번 쓰이면 식이 지나치게 복잡해질 수 있으므로 한번만 사용하기를 권장한다.
		int x = 6;
		x = x++ - ++x;//-1인지 -2인지 헷갈린다
		System.out.println(x);//답은 -2
		
	}
}
	