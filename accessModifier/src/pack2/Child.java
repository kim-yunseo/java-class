package pack2;

import pack1.Parent;

public class Child extends Parent{ //parent 에서 상속 받음
	public void printChild() {     //설계도의 메서드는 호출해야 실행
		System.out.println("=== 자식 클래스 접근 ===");
		System.out.println("public a = " + a);
		System.out.println("protected b = " + b);
		//System.out.println("default c = " + c);  //같은 패키지에서 접근 가능
		//System.out.println("private d = " + d);  //같은 클래스에서만 접근 가능
	}

}
