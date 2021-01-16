import java.util.Scanner;

public class Work6 { 

	public static void main(String[] args) {
		// 1.
		int number=5;
		
		number = number << 4;
		System.out.println("number = " + number);
		number = number >> 3;
		System.out.println("number = " + number);
		number = number << 1;
		System.out.println("number = " + number);
		
		// 2.
		int num1 = 128;
		int num2 = 56;
		System.out.printf("0x%x \n", num1);
		System.out.printf("0x%x \n", num2);
		
		num1 = 0x80;
		num2 = 0x38;
		
		num1 = (num1&num2)|(num1&num2);
		System.out.printf("0x%x \n", num1);
		
		num1 = 0x80;
		num2 = 0x38;
		
		num2 = ~(num1^num2);
		System.out.printf("0x%x \n", num2);
		
		// 3.
		/*Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("num = ");
		num = sc.nextInt();
	
		if(num>=0)
			System.out.println("양수입니다.");
		else 
			System.out.println("음수입니다.");
		*/
		
		// 4.
		// 0~99 개수 : 1개
		int r = (int)(Math.random() * 100);
		System.out.println("r = "+ r);
		
		r = (int)(Math.random() * 5)+11;
		System.out.println("r = "+ r);
	
		int r1 = (int)(Math.random() * 45)+1;
		int r2 = (int)(Math.random() * 45)+1;
		int r3 = (int)(Math.random() * 45)+1;
		int r4 = (int)(Math.random() * 45)+1;
		int r5 = (int)(Math.random() * 45)+1;
		int r6 = (int)(Math.random() * 45)+1;
		System.out.println("6개의 램덤 수 "+ r1 + "," +r2 + "," +r3 + "," +r4 + "," +r5 + "," +r6);
	
	}

}
