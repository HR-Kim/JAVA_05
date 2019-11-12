package kr.co.sist02.controlswitch;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		System.out.println("주민번호를 입력 하세요.(011231-1111222)");
		Scanner scanner=new Scanner(System.in);
		String regNo = scanner.nextLine();
		//011231-1111222
		//int idx= regNo.indexOf("-");
		//System.out.println("idx:"+idx);
		//System.out.println(regNo.subSequence(0, idx));
		char gender = regNo.charAt(7);
		//System.out.println("gender="+gender);
		System.out.println("┌─────────────────┐");
		System.out.println("│문자                          │");
		System.out.println("└─────────────────┘");
		switch(gender) {
			case '1':
			case '3':
				switch(gender) {
					case '1':
						System.out.println("2000년 이전 생 입니다.");
						break;
					default:
						System.out.println("2000년 이후 생 입니다.");
						break;
				}
				System.out.println("남자 입니다.");
				break;
			case '2':
			case '4':
				if(gender=='2') {
					System.out.println("2000년 이전 생 입니다.");
				}else {
					System.out.println("2000년 이후 생 입니다.");
				}
				System.out.println("여자 입니다.");
				break;	
			default:
				System.out.println("유효하지 않는 주민 번호 입니다.");
				break;
		}
		
		
		
		
	}

}
