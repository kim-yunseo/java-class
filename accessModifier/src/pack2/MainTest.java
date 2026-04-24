package pack2;

import pack1.Parent; //같은 패키지가 아니면 import를 해야하한다.

public class MainTest {
	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();
		
		System.out.println("=== 일반 객체 접근 ===");
		
		System.out.println("public a = "+ pa.a);      //어느 곳에서나 접근 가능
		//System.out.println("protected b = "+ pa.b); //같은 패키지나 상속받은 클래스에서 접근 가능
		//System.out.println("default c = "+ pa.c);   //같은 패키지에서 접근 가능
		//System.out.println("private d = "+ pa.d);   //같은 클래스에서만 접근 가능
		
		// 자식 클래스 접근
		ch.printChild();
	}

}
