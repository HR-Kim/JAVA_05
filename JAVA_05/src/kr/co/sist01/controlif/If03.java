package kr.co.sist01.controlif;

import java.util.Scanner;

public class If03 {
	//점수를 입력 받고, 학점 출력(A,B,C,D,E)
	public static void main(String[] args) {
		int score  = 0;
		char grade = ' ';
		
		System.out.printf("점수를 입력 하세요.>>");
		Scanner scanner=new Scanner(System.in);
		
		score = scanner.nextInt();
		
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}




