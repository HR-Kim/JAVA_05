package kr.co.sist01.controlif;

import java.util.Scanner;

public class If04 {
	//������ �Է� �ް�, ���� ���(A,B,C,D,E)
	public static void main(String[] args) {
		int score  = 0;
		char grade = ' ';
		char opt   = ' ';
		
		System.out.printf("������ �Է� �ϼ���.>>");
		Scanner scanner=new Scanner(System.in);
		
		score = scanner.nextInt();
		
		if(score>=90) {
			grade = 'A';
			//+, -ó��
			if(score>=95) {
				opt ='+';
			}else {
				opt ='-';
			}
			
			
		}else if(score>=80) {
			grade = 'B';
			//+, -ó��
			if(score>=85) {
				opt ='+';
			}else {
				opt ='-';
			}			
		}else if(score>=70) {
			grade = 'C';
			//+, -ó��
			if(score>=75) {
				opt ='+';
			}else {
				opt ='-';
			}			
		}else if(score>=60) {
			grade = 'D';
			//+, -ó��
			if(score>=65) {
				opt ='+';
			}else {
				opt ='-';
			}			
		}else {
			grade = 'F';
		}
		System.out.printf("����� ������ %c%c �Դϴ�."
				,grade,opt);
		//System.out.println("����� ������ "+grade+"�Դϴ�.");
	}

}




