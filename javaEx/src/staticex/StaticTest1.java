package staticex;

class Counter{
	int cnt = 0;      //일반 변수, 초기값 0
	
	void increase() { //메서드
		cnt++;        //cnt 후위연산
	}
}


public class StaticTest1 {
	public static void main(String[] args) {
		Counter c1 = new Counter(); //c1객체 생성
		Counter c2 = new Counter(); //c2객체 생성
		
		c1.increase();              //c1 객체 메서드 호출
		c2.increase();              //c2 객체 매서드 호출
		
		System.out.println("c1: "+c1.cnt);  //0+1=1
		System.out.println("c2: "+c2.cnt);  //0+1=1
	//일반변수는 객체마다 각각의 기억장소가 생성된다.
	}

}
