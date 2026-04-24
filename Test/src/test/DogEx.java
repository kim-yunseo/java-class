package test;
// 자식/서브 클래스
public class DogEx extends AnimalEx{
	String breed;
	
	DogEx(String name, int age, String breed){
		super(name,age); //부모생성자 호출
		this.breed = breed;
	}
	
	void showdog() {
		show(); // 부모 메서드
		System.out.println("품종: "+breed);
	}

}
