package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		//1 ~3
		//Math.random();//0.0<=x<1.0
		//1. ������ 3�� ���Ѵ�.
		//2. �� ���� int�� ĳ���� �Ѵ�.
		//3. ������ 1�� ���Ѵ�.
		int com = (int)(Math.random()*3)+1;
		//System.out.println("com:"+com);
		System.out.println("����(1),����(2),��(3)�� �Է� �ϼ���.");
		Scanner scanner=new Scanner(System.in);
		int user= scanner.nextInt();
		System.out.println("User�� "+user+" �Դϴ�.");
		System.out.println("���� "+com+" �Դϴ�.");
		
		switch(user-com) {
			case -1: 
			case 2:
				System.out.println("User�� �����ϴ�.");
				break;
			case 1: 
			case -2:
				System.out.println("User�� �̰���ϴ�.");
				break;	
			default:
				System.out.println("�����ϴ�.");
				break;
		}//--switch
		
		
		
		

	}

}
