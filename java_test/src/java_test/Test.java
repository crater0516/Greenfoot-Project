package java_test;

public class Test
{
	public static void main (String [] args)
	{
		// 10���� �ڵ��� ��ü ����
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
		// ��ü ���� �Ϸ�
		System.out.println(phone0);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		System.out.println(phone4);
		System.out.println(phone5);
		System.out.println(phone6);
		System.out.println(phone7);
		System.out.println(phone8);
		System.out.println(phone9); // �ʱ������ ��ü�� ���� ���
		if (phone5.findMyPhone()) // findMyPhone �޼ҵ� �۵�
		{
			phone5.beep();
			phone5.lock();
			System.out.println(phone5); // ��ȭ��ȣ�� ã���� ��쿡�� ���� ���� �� ���
		}
		else
			System.out.println("��ȭ��ȣ�� Ȯ���� �ּ���!");
	}
}
