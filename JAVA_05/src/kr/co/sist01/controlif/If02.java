package kr.co.sist01.controlif;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է� �ϼ���.>>");
		Scanner scanner=new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("0�Դϴ�.");
		}else {
			System.out.println("0�� �ƴմϴ�.("+input+")");
		}
		
		
		
		

	}

}
