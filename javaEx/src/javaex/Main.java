package javaex;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("홍길동",201,3500000);
		e.print();
		System.out.println("수정 정보");
		//이름을 이순신 수정
		e.setName("이순신");
		//사번을 205로 수정
		e.setNo(205);
		//급여는 5000000로 수정
		e.setPay(5000000);
		e.print();
	}

}
