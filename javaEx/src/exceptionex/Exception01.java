package exceptionex;
//
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exception01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		try {
			int n = sc.nextInt();          //정수 입력
			if(n%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		}
		catch (InputMismatchException e) { //예외상황발생 시 실행
			System.out.println("잘못입력하셨습니다.");
			System.out.println("정수를 입력해주세요.");
		}
		finally { //예외 여부 관계없이 항상 수행
			System.out.println("프로그램을 종료합니다.");
			sc.close();
		}
	}

}
