package kr.co.sist04.controlwhile;

public class While03 {

	public static void main(String[] args) {
		int num = 0;//입력저장 변수
		int sum = 0;//누적변수

		num = 12345;
		
		while(num!=0) {
			sum+=num%10;//5,4,..1
			System.out.printf("sum=%3d num=%d\n",sum,num);
			num/=10;//1234
			
		}//--while
		System.out.println("sum:"+sum);
	}
//	사용자로 부터 숫자 입력
//	12345
//	1+2+3+4+5
//	1. 무한 roof
//	2. 막지막 1자리 자르기: %
//	3. 일->십->백...:자리이동 /
//	sum=  5 num=12345
//	sum=  9 num=1234
//	sum= 12 num=123
//	sum= 14 num=12
//	sum= 15 num=1
//	sum:15
}
