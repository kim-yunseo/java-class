package staticex;

//static 변수는 "클래스가 메모리에 로딩될때" 생성
//모든 객체가 공유
//객체 없이 사용 가능(클래스 이름으로 접근)
//한 번만 생성됨(끝까지)

class Counter2{
	static int cnt = 0;        //클래스 변수, 초기값 0
	
	static void increase() {   //클래스 메서드
		cnt++;                 //cnt 후위연산
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		
		Counter2.increase();   //한번 만들어지면 계속 유지
		Counter2.increase();   //바로 접근 가능
		
		System.out.println("count: "+Counter2.cnt); 
	}   //0+1=1 //1+1=2

}
