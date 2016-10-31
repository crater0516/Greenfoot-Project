package java_programming_09;

public class Test
{
	public static void main (String[] args)
	{
		Vehicle vc = new Vehicle(1990, 50, "Benz");
		System.out.println(vc);
		
		Car car = new Car(1990, 50, "Benz", 5);
		System.out.println(car);
		car.setBoost(10); // ���ӵ��� 10���� ����
		car.speedUp(20); // �ӵ��� 20��ŭ ����
		System.out.println(car);
		
		Airplane airplane = new Airplane(1987, 500, "Asiana", 3000);
		System.out.println(airplane);
		airplane.speedDown(40); // �ӵ��� 40��ŭ ����
		airplane.setHeight(2000); // ���̸� 2000���� ����
		System.out.println(airplane);
		
		Submarine submarine = new Submarine (2015, 20, "Jangbogo", 200);
		System.out.println(submarine);
		submarine.setCompany("Jeanair"); // �귣����� Jeanair ���� ����
		submarine.setDepth(500); // ������ 500���� ����
		System.out.println(submarine);
	}
}
