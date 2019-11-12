package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력 하세요.");
		Scanner scanner=new Scanner(System.in);
		
		int month = scanner.nextInt();
		switch(month) {
			case 3:
				System.out.println("봄 입니다.");
				break;					
			case 4:
				System.out.println("봄 입니다.");
				break;					
			case 5:
				System.out.println("봄 입니다.");
				break;	
			case 6:case 7: case 8:
				System.out.println("여름 입니다.");
				break;
			case 9:case 10: case 11:
				System.out.println("가을 입니다.");
				break;				
			default://12,1,2
				System.out.println("겨울 입니다.");
				break;
		}
		

	}
	
//	switch(조건)//정수,문자열(1.7)		
//	{		
//	   case 값1://if	3,4,5	봄
//	        statement01;	6,7,8	여름
//	        statement02;	9,10,11	가을
//	        statementN;	12,1,2	겨울
//	   break;		
//			
//	   case 값2://else if		
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
