package kr.co.sist04.controlwhile;

import java.util.Scanner;

public class While04 {
	//����ڷκ��� �ݺ��ؼ� ���ڸ� �Է� �޴ٰ� 0�� 
	//�Է� ������ ���� ���� ���.
	//while(flag==true){
	
//		if(����)flag = false;
//    }
	public static void main(String[] args) {
		int num =-1;//�Էº���
		int sum =0;//sum
		boolean flag = true;

		System.out.println("�հ踦 ���� ���ڸ� �Է� �ϼ���"
				+ ".(����� 0)");
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
		
		System.out.println("�հ�:"+sum);
		
	}

}






