package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		System.out.println("���� ���� �Է� �ϼ���.");
		Scanner scanner=new Scanner(System.in);
		
		int month = scanner.nextInt();
		switch(month) {
			case 3:
				System.out.println("�� �Դϴ�.");
				break;					
			case 4:
				System.out.println("�� �Դϴ�.");
				break;					
			case 5:
				System.out.println("�� �Դϴ�.");
				break;	
			case 6:case 7: case 8:
				System.out.println("���� �Դϴ�.");
				break;
			case 9:case 10: case 11:
				System.out.println("���� �Դϴ�.");
				break;				
			default://12,1,2
				System.out.println("�ܿ� �Դϴ�.");
				break;
		}
		

	}
	
//	switch(����)//����,���ڿ�(1.7)		
//	{		
//	   case ��1://if	3,4,5	��
//	        statement01;	6,7,8	����
//	        statement02;	9,10,11	����
//	        statementN;	12,1,2	�ܿ�
//	   break;		
//			
//	   case ��2://else if		
//	        statement01;		
//	        statement02;		
//	        statementN;		
//	   break;		
//			
//			
//			
//	   default://else		
//			
//	   break;		

}
