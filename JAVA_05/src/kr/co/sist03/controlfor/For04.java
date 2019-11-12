package kr.co.sist03.controlfor;

import java.util.Scanner;

public class For04 {
//  for(int i=0,j=10;i<5;i++,j--){	
//
//	}	

	public static void main(String[] args) {
		System.out.println("누적할 숫자를 입력 하세요.");
		Scanner scanner=new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;//누적변수
		for(int i=1;i<=num;i++) {
			sum=sum+i;//sum+=1;
		}
		System.out.println("누적값은 "+sum+" 입니다.");
	}

}
