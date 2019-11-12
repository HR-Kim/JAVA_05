package kr.co.sist03.controlfor;

import java.util.Scanner;

public class For07 {
//	*				
//	**		
//	***		
//	****	
//	*****

	public static void main(String[] args) {
		System.out.println("출력할 별 라인수를 입력 하세요.>>");
		Scanner scanner=new Scanner(System.in);
		int num = scanner.nextInt();
				
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}//--for j
			System.out.println();
		}//--for i

	}

}




