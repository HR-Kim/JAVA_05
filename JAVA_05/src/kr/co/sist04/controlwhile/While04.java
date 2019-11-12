package kr.co.sist04.controlwhile;

import java.util.Scanner;

public class While04 {
	//사용자로부터 반복해서 숫자를 입력 받다가 0을 
	//입력 받으면 종료 총합 출력.
	//while(flag==true){
	
//		if(조건)flag = false;
//    }
	public static void main(String[] args) {
		int num =-1;//입력변수
		int sum =0;//sum
		boolean flag = true;

		System.out.println("합계를 구할 숫자를 입력 하세요"
				+ ".(종료는 0)");
		while(flag) {
			System.out.print(">>");
			Scanner scanner=new Scanner(System.in);
			num = scanner.nextInt();
			
			if(num!=0) {
				sum+=num;//sum=sum+num
			}else {
				flag = false;
			}
		}//--while
		
		System.out.println("합계:"+sum);
		
	}

}






