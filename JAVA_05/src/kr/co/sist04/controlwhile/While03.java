package kr.co.sist04.controlwhile;

public class While03 {

	public static void main(String[] args) {
		int num = 0;//�Է����� ����
		int sum = 0;//��������

		num = 12345;
		
		while(num!=0) {
			sum+=num%10;//5,4,..1
			System.out.printf("sum=%3d num=%d\n",sum,num);
			num/=10;//1234
			
		}//--while
		System.out.println("sum:"+sum);
	}
//	����ڷ� ���� ���� �Է�
//	12345
//	1+2+3+4+5
//	1. ���� roof
//	2. ������ 1�ڸ� �ڸ���: %
//	3. ��->��->��...:�ڸ��̵� /
//	sum=  5 num=12345
//	sum=  9 num=1234
//	sum= 12 num=123
//	sum= 14 num=12
//	sum= 15 num=1
//	sum:15
}
