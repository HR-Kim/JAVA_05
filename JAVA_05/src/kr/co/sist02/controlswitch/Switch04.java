package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch04 {
//  if->switch ~ case 
//      score/10//99,98,  -> 9	
//	if(score>=90) {
//		grade = 'A';
//	}else if(score>=80) {
//		grade = 'B';
//	}else if(score>=70) {
//		grade = 'C';
//	}else if(score>=60) {
//		grade = 'D';
//	}else {
//		grade = 'F';
//	}
	public static void main(String[] args) {
		System.out.println("┌────────────────┐");
		System.out.println("│점수를 입력 하세요.  │");
		System.out.println("└────────────────┘");

		int score  = 0;
		char grade = ' ';
		char opt   = ' ';
		
		Scanner scanner=new Scanner(System.in);
		
		score = scanner.nextInt();	
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				if(score>=95) {
					opt ='+';
				}else {
					opt ='-';
				}
				
					
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;	
			case 6:
				grade = 'D';
				break;	
			default:
				grade = 'F';
				break;				
		}
		
		System.out.println("당신의 학점은 "+grade+opt+"입니다.");
	}

}
