package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		System.out.println("�ֹι�ȣ�� �Է� �ϼ���.(011231-1111222)");
		Scanner scanner=new Scanner(System.in);
		String regNo = scanner.nextLine();
		//011231-1111222
		//int idx= regNo.indexOf("-");
		//System.out.println("idx:"+idx);
		//System.out.println(regNo.subSequence(0, idx));
		char gender = regNo.charAt(7);
		//System.out.println("gender="+gender);
		System.out.println("��������������������������������������");
		System.out.println("������                          ��");
		System.out.println("��������������������������������������");
		switch(gender) {
			case '1':
			case '3':
				switch(gender) {
					case '1':
						System.out.println("2000�� ���� �� �Դϴ�.");
						break;
					default:
						System.out.println("2000�� ���� �� �Դϴ�.");
						break;
				}
				System.out.println("���� �Դϴ�.");
				break;
			case '2':
			case '4':
				if(gender=='2') {
					System.out.println("2000�� ���� �� �Դϴ�.");
				}else {
					System.out.println("2000�� ���� �� �Դϴ�.");
				}
				System.out.println("���� �Դϴ�.");
				break;	
			default:
				System.out.println("��ȿ���� �ʴ� �ֹ� ��ȣ �Դϴ�.");
				break;
		}
		
		
		
		
	}

}
