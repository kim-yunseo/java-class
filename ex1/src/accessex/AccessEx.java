package accessex;

class Sample{
	public int a;
	private int b;
	int c;
	public void show() {
		System.out.println("Parent 메서드 실행");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
	}
}

public class AccessEx {
	public static void main(String[] args) {
		

		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;
		//private은 같은 클래스만 가능하다.
		sample.c =10;
	System.out.println("=== 같은 패키지 테스트 ===");
	System.out.println("public a = " + sample.a);
	System.out.println("protected b = " +sample.c);
	System.out.println("\n=== 메서드 호출 ===");
	sample.show();
	}
}
