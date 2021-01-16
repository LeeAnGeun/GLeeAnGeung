import java.util.Scanner;

public class Work7 {

	public static void main(String[] args) {
		
		/*
		    입력 -> 10진수
		    출력 -> 2진수
		    출력 -> 8진수
		    출력 -> 16진수
		 */
		
		/*
		    입력 -> 2진수
		    출력 -> 10진수
		 */
		
		/*
		    입력 -> 16진수
		    출력 -> 10진수
		 */
		
		// 입력 : 10진수 -> 출력: 2진수 8진수 16진수
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("num = ");
		num = sc.nextInt();
		
		String a2 = Integer.toBinaryString(num); // 10진수 -> 2진수
		String a8 = Integer.toOctalString(num);  // 10진수 -> 8진수
		String a16 = Integer.toHexString(num);   // 10진수 -> 16진수
		
		//출력
		System.out.println("2진수 : "+ a2);
		System.out.println("8진수 : 0"+ a8);
		System.out.println("16진수 : 0x"+ a16);
		
		// 입력 : 2진수 16진수 -> 출력: 10진수
		
		String a2_2;
		System.out.print("a2_2: ");   
		a2_2 = sc.next();               // 2진수 입력 
		
		int a2_10 = Integer.parseInt(a2_2, 2);   // 2진수 -> 10진수
		System.out.println("10진수 : "+ a2_10); 
		
		String a2_16;
		System.out.print("a2_16: ");  
		a2_16 = sc.next();              // 16진수 입력
		
		a2_10 = Integer.parseInt(a2_16, 16);    // 16진수 -> 10진수
		System.out.println("10진수 : "+ a2_10); 
		
		
		// 10진수 -> 2진수
		/*
		Scanner sc = new Scanner(System.in);
		int a10;
		System.out.print("a10 = ");
		a10 = sc.nextInt();
		
		int b2[] = new int[8];
		for(int i=0;i<8;i++) {
			b2[i] = a10%2;
			a10 = a10/2;
			if(a10/2==1) {
				b2[i]=1;
			}
			System.out.print(b2[i]);
      		}
		*/	
	}

}
