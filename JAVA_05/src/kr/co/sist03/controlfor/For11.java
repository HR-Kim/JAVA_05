package kr.co.sist03.controlfor;

public class For11 {

	public static void main(String[] args) {
		// ���� for : for(Ÿ�� ����:�迭 �Ǵ� �÷���){
		//            ����;
		//              tmp;
		//            }
		//1. for
		int[] arr = {10,20,30,40,50};	
		int sum   = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		
		//2. ���� for
		for( int tmp:arr) {
			System.out.printf("%d ",tmp);
			sum+=tmp;
		}
		
		System.out.println("sum:"+sum);
		
	}

}
