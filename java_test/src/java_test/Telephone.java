package java_test;

import java.util.Scanner; // Scanner ����� ���� import

public class Telephone
{
	//�ʵ� ����
	private int IMEI; // ������ȣ
	private String vendor; // ��Ż� �̸�
	private String phoneNumber; // ��ȭ��ȣ
	private String deviceInfo; // �ܸ��� ����
	private boolean lockState; // ��ݻ��� ���� true : ����� �ƴ�, false : ���
	
	public Telephone() // �⺻ ������
	{
		IMEI = 0;
		vendor = "default vendor";
		phoneNumber = "010-0000-0000";
		deviceInfo = "default device";
		lockState = true;
	}
	public Telephone(int newIMEI, String newVendor, String newNumber, String newInfo, boolean newState) // ������
	{
		IMEI = newIMEI;
		vendor = newVendor;
		phoneNumber = newNumber;
		deviceInfo = newInfo;
		lockState = newState;
	}
	// ������
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
	// ������ ��
	// ������
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
	// ������ ��
	public String toString () // toString �޼ҵ� ����
	{
		String nowState;
		if (lockState)
			nowState = "����� ����";
		else
			nowState = "���";
		return "���� �޴����� ��Ż�� " + vendor + ", �޴��� ��ȣ�� " + phoneNumber + ", �ܸ��� ������ " + deviceInfo + ", ��ݻ��´� " + nowState + " �Դϴ�.";
	}
	public boolean findMyPhone () // findMyPhone �޼ҵ� ����
	{
		Scanner scan = new Scanner (System.in); // ��ĳ�� ����
		if (scan.next().equals(this.phoneNumber))
		{
			scan.close(); // ��ĳ�� close
			System.out.println("�ڵ����� ã�ҽ��ϴ�!");
			return true;
		}
		else
		{
			scan.close(); // ��ĳ�� close
			System.out.println("�ڵ����� ã�� ���߽��ϴ�.");
			return false;
		}
	}
	public void beep () // ������ ������
	{
		System.out.println("������~ ������~");
	}
	public void lock () // lock �޼ҵ� ����
	{
		lockState = false;
	}
}
