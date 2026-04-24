package staticex;

class Counter2{
	static int cnt = 0;        //클래스 변수, 초기값 0
	
	static void increase() {   //클래스 메서드
		cnt++;                 //cnt+1
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		
		Counter2.increase();   //한번 만들어지면 계속 유지하기 때문에
		Counter2.increase();   //바로 접근 가능
		
		System.out.println("count: "+Counter2.cnt);
	}

}
