package ex1;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog(); //자식 객체
		d.name ="뽀삐";
		d.age = 2;
		d.color="검정";
		
		System.out.println("이름은: "+d.name);
		System.out.println("나이는: "+d.age);
		System.out.println("색깔은: "+d.color);
		
		//부모 클래스 메서드 호출
		d.eat();
		d.sleep();
		//자식 클래스 메서드 호출
		d.bark();
		d.run();
		
		//d.show();

	}

}
