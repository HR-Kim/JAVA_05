package kr.co.sist01.controlif;
import java.util.Scanner;
public class If01 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력 하세요.>>");
		Scanner scanner=new Scanner(System.in);
		int input = scanner.nextInt();
		//System.out.println("input:"+(input+1));
		
		//숫자를 입력 받고 0여부 판단.
		if(input==0 ) {
			System.out.println("-------------------");
			System.out.println("입력 하신 숫자는 0입니다.");
			System.out.println("-------------------");
		}
		
		if(input!=0 ) {
			System.out.println("-------------------");
			System.out.println("입력 하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.\n",input);
			System.out.println("-------------------");			
		}

	}

}
