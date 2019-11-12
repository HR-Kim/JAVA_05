package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		//1 ~3
		//Math.random();//0.0<=x<1.0
		//1. 각변에 3을 곱한다.
		//2. 각 변을 int로 캐스팅 한다.
		//3. 각변에 1을 더한다.
		int com = (int)(Math.random()*3)+1;
		//System.out.println("com:"+com);
		System.out.println("가위(1),바위(2),보(3)를 입력 하세요.");
		Scanner scanner=new Scanner(System.in);
		int user= scanner.nextInt();
		System.out.println("User는 "+user+" 입니다.");
		System.out.println("컴은 "+com+" 입니다.");
		
		switch(user-com) {
			case -1: 
			case 2:
				System.out.println("User가 졌습니다.");
				break;
			case 1: 
			case -2:
				System.out.println("User가 이겼습니다.");
				break;	
			default:
				System.out.println("비겼습니다.");
				break;
		}//--switch
		
		
		
		

	}

}
