package kr.co.sist04.controlwhile;

public class While02 {

	public static void main(String[] args) {
		// 11 ---> 10,9...0;
		int i=11;
		System.out.println("카운트 다운 시작!");
		while(i!=0) {
			
			i--;
			System.out.println(i);
			for(int j=0;j<2_000_000_000;j++) {
				for(int k=0;k<1000000;k++) {
					;
				}
			}
		}

	}

}
