import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		/*
		    편의점
		    
		    지불금액     : 3,210원
		    본인금액     : 10,000원
		    
		    거스름돈 -> ?
		    
		    5000원 -> ?
		    1000원 -> ?
		    500원 -> ?
		    50원 -> ?
		    10원 -> ?
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int hcg;         // 지불금액
		int mcg;         // 본인금액
		int sum;         // 거스름돈
		int n;           // 지패의수
		
		System.out.print("지불금액= ");
		hcg=sc.nextInt();
		
		System.out.print("본인금액= ");
		mcg=sc.nextInt();
		
		//거스름돈
		sum = mcg - hcg;
		
		// 5000원의 수
		n= sum/5000; 
		System.out.println("5000원 = " + n);
		sum = sum - (5000*n);  // 계산 후 나머지 값
		
		// 1000원의 수
		n= sum/1000;
		System.out.println("1000원 = " + n);
		sum = sum - (1000*n);
		
		// 500원의 수
		n= sum/500;
		System.out.println("500원 = " + n);
		sum = sum - (500*n);
		
		// 100원의 수
		n= sum/100;
		System.out.println("100원 = " + n);
		sum = sum - (100*n);
		
		// 50원의 수
		n= sum/50;
		System.out.println("50원 = " + n);
		sum = sum - (50*n);
		
		// 10원의 수
		n= sum/10;
		System.out.println("10원 = " + n);
		sum = sum - (10*n);

		// 나머지 금액
		System.out.println("tip = " + sum);
	}
}
