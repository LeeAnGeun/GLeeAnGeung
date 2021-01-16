import java.util.Scanner;

public class Work8 {

	public static void main(String[] args) {
		// 과제 1.
		// 1~1000사이에 수를 전부 합친 값을 출력하라.
		
		int result=0;
		for(int i=1; i<1001; i++) {
			result += i;
		}
		System.out.println("result = "+ result);
		
		// 과제 2.
		// 하나의 수를 입력 받고 입력 받은 수는 어느 범위에 있는지 출력되는 프로그램을 작성하라.
		// 0~100사이의 수
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("num= ");
		num = sc.nextInt();
		
		if(num>0 && num<10)
			System.out.println("입력한 수는 0보다 크고 10보다 작다.");
		else if(num>10 && num<20)
			System.out.println("입력한 수는 10보다 크고 20보다 작다.");
		else if(num>20 && num<30)
			System.out.println("입력한 수는 20보다 크고 30보다 작다.");
		else if(num>30 && num<40)
			System.out.println("입력한 수는 30보다 크고 40보다 작다.");
		else if(num>40 && num<50)
			System.out.println("입력한 수는 40보다 크고 50보다 작다.");
		else if(num>50 && num<60)
			System.out.println("입력한 수는 50보다 크고 60보다 작다.");
		else if(num>60 && num<70)
			System.out.println("입력한 수는 60보다 크고 70보다 작다.");
		else if(num>70 && num<80)
			System.out.println("입력한 수는 70보다 크고 80보다 작다.");
		else if(num>80 && num<90)
			System.out.println("입력한 수는 80보다 크고 90보다 작다.");
		else if(num>80 && num<90)
			System.out.println("입력한 수는 80보다 크고 90보다 작다.");
		else if(num>90 && num<100)
			System.out.println("입력한 수는 90보다 크고 100보다 작다.");
		
		System.out.print("num= ");
		num = sc.nextInt();
		
		for(int i=0; i<101 ; i+=10) {
			if(num>i && num<(i+10))
				System.out.println("입력한 수는 " + i + "보다 크고" + (i+10) + " 보다 작다");
		}
		
		
		// 과제 3.
		// 다음 모양이 출력 되도록 작성하시오.
		/*
		    *****
		    *****
		    *****
		    *****
		    *****
		    *****
		    *****
		    *****
		    *****   9줄
		 */
		
		for(int i=0 ; i<9; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 과제 4.
		// 다음 모양이 출력 되도록 작성하시오.
		/*
		   *
		   **
		   ***
		   ****
		   *****
		   ****
		   ***
		   **
		   *
		 */
		
		// 이중 for문 두개 사용
		for(int i=0;i<5;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				}	
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 이중 for문 한개 사용
		int t = 0;
		for(int i=0;i<9;i++) {
			
			if(i<5) t++;
			else    t--;
			
			for(int j=0; j<t; j++) {
				System.out.print("*");
				}	
			System.out.println();
		}
		
		// 과제 5.
		// 구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
		for(int i=1; i<10; i++) {
			System.out.println(i+"단 입니다.");
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		
		// 과제 6.
		// 임의 수를 입력 받고 그 해당하는 수의 구구단을 출력하는 프로그램을 작성하라.
		
		int number;
		System.out.print("number = ");
		number = sc.nextInt();
		System.out.println(number+"단입니다.");
		for(int i=1; i<10; i++) {
			System.out.println(number + "x" + i + "=" + (number*i));
		}
		
		// 과제 7.
		// 1 ~ 100 사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라.
		int sum1=0;         // int sum1, sum2;
		int sum2=0;         // sum1 = sum2 = 0; -> 같은 값을 대입할 때 가능
		for(int i=1; i<101; i++) {
			if(i%2==0) {          // 짝수 합
				sum1 += i;
			}
			else if(i%2==1) {     // 혹수 합
				sum2 += i;
			}	
		}
		System.out.println("1~100 사이 짝수의 합 = "+ sum1);
		System.out.println("1~100 사이 홀수의 합 = "+ sum2);
		
		
		// 과제 8.
		/*
		    입력받은 숫자들의 합계를 구하라
		    >> 숫자 몇개?
		    >> 입력
		    >> 합계출력
		*/
		int n;  // 숫자 몇개?
		System.out.print("n = ");
		n = sc.nextInt();
		int nArray[] = new int[n];
		int sum=0;        // 합계변수
		
		// 입력
		for(int i=0;i<n;i++) {
			System.out.print("nArray" + "[" + i + "] =" );
			nArray[i] = sc.nextInt();
			sum += nArray[i];
		}
		
		// 출력
		System.out.println("sum = "+ sum);
	}

}
