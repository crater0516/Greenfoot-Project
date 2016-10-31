package java_test;

import java.util.Scanner; // Scanner 사용을 위해 import

public class Telephone
{
	//필드 구현
	private int IMEI; // 고유번호
	private String vendor; // 통신사 이름
	private String phoneNumber; // 전화번호
	private String deviceInfo; // 단말기 종류
	private boolean lockState; // 잠금상태 여부 true : 잠금이 아님, false : 잠금
	
	public Telephone() // 기본 생성자
	{
		IMEI = 0;
		vendor = "default vendor";
		phoneNumber = "010-0000-0000";
		deviceInfo = "default device";
		lockState = true;
	}
	public Telephone(int newIMEI, String newVendor, String newNumber, String newInfo, boolean newState) // 생성자
	{
		IMEI = newIMEI;
		vendor = newVendor;
		phoneNumber = newNumber;
		deviceInfo = newInfo;
		lockState = newState;
	}
	// 접근자
	public int getIMEI ()
	{
		return IMEI;
	}
	public String getVendor ()
	{
		return vendor;
	}
	public String getPhoneNumber ()
	{
		return phoneNumber;
	}
	public String getDeviceInfo ()
	{
		return deviceInfo;
	}
	public boolean getLockState ()
	{
		return lockState;
	}
	// 접근자 끝
	// 설정자
	public void setIMEI (int newIMEI)
	{
		IMEI = newIMEI;
	}
	public void setVendor (String newVendor)
	{
		vendor = newVendor;
	}
	public void setPhoneNumber (String newNumber)
	{
		phoneNumber = newNumber;
	}
	public void setDeviceInfo (String newInfo)
	{
		deviceInfo = newInfo;
	}
	public void setLockState (boolean newState)
	{
		lockState = newState;
	}
	// 설정자 끝
	public String toString () // toString 메소드 구현
	{
		String nowState;
		if (lockState)
			nowState = "잠기지 않음";
		else
			nowState = "잠김";
		return "현재 휴대폰의 통신사는 " + vendor + ", 휴대폰 번호는 " + phoneNumber + ", 단말기 종류는 " + deviceInfo + ", 잠금상태는 " + nowState + " 입니다.";
	}
	public boolean findMyPhone () // findMyPhone 메소드 구현
	{
		Scanner scan = new Scanner (System.in); // 스캐너 생성
		if (scan.next().equals(this.phoneNumber))
		{
			scan.close(); // 스캐너 close
			System.out.println("핸드폰을 찾았습니다!");
			return true;
		}
		else
		{
			scan.close(); // 스캐너 close
			System.out.println("핸드폰을 찾지 못했습니다.");
			return false;
		}
	}
	public void beep () // 따르릉 따르릉
	{
		System.out.println("따르릉~ 따르릉~");
	}
	public void lock () // lock 메소드 구현
	{
		lockState = false;
	}
}
