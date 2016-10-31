package java_test;

public class Test
{
	public static void main (String [] args)
	{
		// 10개의 핸드폰 객체 생성
		Telephone phone0 = new Telephone(123, "SKT", "010-1234-5678", "Galaxy Notes 7", true);
		Telephone phone1 = new Telephone(243, "KT", "010-1111-2222", "iPhone 7", true);
		Telephone phone2 = new Telephone(421, "LG", "010-4242-3232", "Galaxy Grand Max", true);
		Telephone phone3 = new Telephone(423, "SKT", "010-1232-1342", "Galaxy S 7", true);
		Telephone phone4 = new Telephone(349, "KT", "010-1144-2222", "DDong Phone", true);
		Telephone phone5 = new Telephone(431, "KT", "010-7476-4727", "myPhone", true);
		Telephone phone6 = new Telephone(121, "LG", "010-1313-8888", "Galaxy.zip", true);
		Telephone phone7 = new Telephone(443, "LG", "010-1414-2223", "Fit Bit", true);
		Telephone phone8 = new Telephone(433, "SKT", "010-2443-1623", "Have No Idea", true);
		Telephone phone9 = new Telephone(433, "SKT", "010-8927-4231", "LastOne", true);
		// 객체 생성 완료
		System.out.println(phone0);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		System.out.println(phone4);
		System.out.println(phone5);
		System.out.println(phone6);
		System.out.println(phone7);
		System.out.println(phone8);
		System.out.println(phone9); // 초기생성된 객체들 정보 출력
		if (phone5.findMyPhone()) // findMyPhone 메소드 작동
		{
			phone5.beep();
			phone5.lock();
			System.out.println(phone5); // 전화번호를 찾았을 경우에만 정보 수정 후 출력
		}
		else
			System.out.println("전화번호를 확인해 주세요!");
	}
}
