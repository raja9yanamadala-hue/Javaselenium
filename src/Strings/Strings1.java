package Strings;

public class Strings1 {

	public static void main(String[] args) {
		int number = 968;
		int revno=0;
		while(number!=0) {
			revno=revno*10+number%10;
			number=number/10;
		}
		System.out.println("reverse number is  "+revno  );
	}

}
