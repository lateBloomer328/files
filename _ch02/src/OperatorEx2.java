public class OperatorEx2 {
	public static void main(String[] args) {
		int i = 3, j = 0;
		j = i++;
		System.out.println("j=i++ 실행 후 i="+ i + ", j =" + j);// 후위 증감 연산자의 경우 먼저 i값을 불러와 대입한 후에 i의 값을 대입하기 때문에 i값은 1증가하고 j값은 증가 하지 않은채 출력한다.
		
		i=3;
		j=0;
		j=++i;
		System.out.println("j=++i 실행 후 i="+ i + ", j =" + j);// 전위 증감 연산자의 경우 먼저 증감 연산을 실행 한 후 i값을 불러와 대입한다. 따라서 i와 ,j모두 1식 
		//OperatorEx3에 위와 같은 연산이 처리되는 과정을 다룬다
	}
	}
	