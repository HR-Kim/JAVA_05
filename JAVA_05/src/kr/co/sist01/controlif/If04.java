package kr.co.sist01.controlif;

import java.util.Scanner;

public class If04 {
	//점수를 입력 받고, 학점 출력(A,B,C,D,E)
	public static void main(String[] args) {
		int score  = 0;
		char grade = ' ';
		char opt   = ' ';
		
		System.out.printf("점수를 입력 하세요.>>");
		Scanner scanner=new Scanner(System.in);
		
		score = scanner.nextInt();
		
		if(score>=90) {
			grade = 'A';
			//+, -처리
			if(score>=95) {
				opt ='+';
			}else {
				opt ='-';
			}
			
			
		}else if(score>=80) {
			grade = 'B';
			//+, -처리
			if(score>=85) {
				opt ='+';
			}else {
				opt ='-';
			}			
		}else if(score>=70) {
			grade = 'C';
			//+, -처리
			if(score>=75) {
				opt ='+';
			}else {
				opt ='-';
			}			
		}else if(score>=60) {
			grade = 'D';
			//+, -처리
			if(score>=65) {
				opt ='+';
			}else {
				opt ='-';
			}			
		}else {
			grade = 'F';
		}
		System.out.printf("당신의 학점은 %c%c 입니다."
				,grade,opt);
		//System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}




