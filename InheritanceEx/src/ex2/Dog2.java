package ex2;

public class Dog2 extends Animal2 {
	@Override //오버라이드
	void sound() { 
		System.out.println("강아지가 멍멍짖습니다.");
	}

	@Override 
	//부모클래스에 있는 메서드 이름과 자식 클래스 메서드의 이름이 같은 것
	//자식이 부모와 동일한 메서드를 재정의
	void move() {
		System.out.println("강아지가 네발로 움직입니다.");
	}
	

}
