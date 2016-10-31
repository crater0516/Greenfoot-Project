package java_programming_09;

public class Airplane extends Vehicle
{
	private int height;
	public Airplane ()
	{
		super(); // Vehicle field 초기화
		height = 0; // Airplane field 초기화
	}
	public Airplane (int newYears, int newSpeed, String newCompany, int newHeight) // 값이 존재하는 생성자
	{
		super (newYears, newSpeed, newCompany);
		height = newHeight;
	}
	public void setHeight (int newHeight) // height 값을 설정하는 설정자
	{
		height = newHeight;
	}
	public int getHeight () // height 값을 반환하는 접근자
	{
		return height;
	}
	public String toString ()
	{
		return "제조 년도는 " + super.getYears() + "년 속력은 시속 " + super.getSpeed() + "km/h 브랜드명은 " + super.getCompany() + " 고도는  " + height + "ft 입니다.";
	}
}
