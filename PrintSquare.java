import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오 : ");
		String length = sc.next();
		try{
			square(length);
		}catch(NumberFormatException e){
			System.out.println("정수가 아닙니다.");
		}
		
		
		// 여기에 코드를 구현하시요
		
		
		
	}

	private static void square(String str) throws NumberFormatException {
		int num = Integer.parseInt(str);
		System.out.println(num * num);    // 면적 값 출력
	}

}