package exceptionex;
//
public class Exception03 {
	public static void main(String[] args) {
		try {
			int [] a = {1,2};
			System.out.println(a[5]);         //에러
			String str = null;
			System.out.println(str.length()); //에러
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위를 벗어남");
		}
		catch (NullPointerException e) {
			System.out.println("null 레퍼런스 참조 에러");
		}
		catch (Exception e) { //Exception : 모든 예외일 떄, 항상 마지막
			System.out.println("기타 에러");
		}
		//catch 문장이 여러개 나오면 첫번째로 해당되는 catch 문장만 실행
	}

}
