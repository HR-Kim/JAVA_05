package kr.co.sist01.controlif;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력 하세요.>>");
		Scanner scanner=new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("0이 아닙니다.("+input+")");
		}
		
		
		
		

	}

}
