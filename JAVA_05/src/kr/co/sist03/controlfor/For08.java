package kr.co.sist03.controlfor;

public class For08 {

	public static void main(String[] args) {
		//9*9
		for(int i=2;i<=11;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d=%2d\n"
						,i,j,(i*j));
			}
		}

	}

}
