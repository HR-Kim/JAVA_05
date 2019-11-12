package kr.co.sist03.controlfor;

public class For02 {

	public static void main(String[] args) {
		//1 ~ 100 ´©Àû
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;//sum+=i
			System.out.println("i="+i+"\tsum="+sum);
		}
		System.out.println("sum="+sum);
	}

}
