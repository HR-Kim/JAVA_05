package kr.co.sist01.controlif;
import java.util.Scanner;
public class If01 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է� �ϼ���.>>");
		Scanner scanner=new Scanner(System.in);
		int input = scanner.nextInt();
		//System.out.println("input:"+(input+1));
		
		//���ڸ� �Է� �ް� 0���� �Ǵ�.
		if(input==0 ) {
			System.out.println("-------------------");
			System.out.println("�Է� �Ͻ� ���ڴ� 0�Դϴ�.");
			System.out.println("-------------------");
		}
		
		if(input!=0 ) {
			System.out.println("-------------------");
			System.out.println("�Է� �Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.printf("�Է��Ͻ� ���ڴ� %d �Դϴ�.\n",input);
			System.out.println("-------------------");			
		}

	}

}
