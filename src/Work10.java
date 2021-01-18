import java.util.Scanner;

public class Work10 {

	public static void main(String[] args) {
		// work 1.
		int arr[]= {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum= "+ sum);
		System.out.println("=====================");
		
		// work 2.
		int arr1[][] = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
		};
		
		int total=0;
		float average=0;

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				total+=arr1[i][j];
			}
		}
		
		average = (float) total / (arr1.length * arr1[0].length);
		
		System.out.println("total = "+ total);
		System.out.println("average = "+ average);
		System.out.println("=====================");
		
		// work 3.
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		int coinUnit[] = {500,100,50,10};
		int money = 2680;
		int n; // 동전에 갯수
		System.out.println("money = "+ money);
		for(int i=0; i< coinUnit.length; i++) {
			n = money / coinUnit[i];
			System.out.println(coinUnit[i] + "의 갯수 = "+ n);
			money= money-(coinUnit[i]*n);
			n=0;
		}
		System.out.println("=====================");
		
		// work 4-1. 암호화
		char abcCode[] =  
			{ 		'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
					'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
					'}', ';', ':', ',', '.', '/'};
					// abcdefghijklmnopqrstuvwxyz 를 위에 표로 암호화
		
		char numberCode[] = {'q','w','e','r','t','y','u','i','o','p'}; 
							// 0 1 2 3 4 5 6 7 8 9 를 위에 표로 암호화

		String src = "abc123";
		String result = "";
		int n1=0;                 // ASCII 코드값을 변환한 값

		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);                        // String 문자열 src를 한글자씩 뽑아냄
			if(ch >= 'a' && ch <= 'z') {
				n1 = (int)(ch-97);
				result = result + abcCode[n1];
			}
		    else if(ch>='0' && ch<='9') {
				n1 = ch-48;
				result += numberCode[n1];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		System.out.println("=====================");
		// work 4-2. 복호화
		String baseCode = "";
			
		for(int i=0; i<result.length(); i++) {
			char ch = result.charAt(i);                      // String 문자열 result 한글자씩 뽑아냄
			int asc = (int)ch;                               // 문자 ch를 ASCII코드화
			
			// 알파벳 -> 숫자가 암호화 numberCode[]
			int index = 0;                                   // 해당 글자 ch가 있는 위치를 넣기위한 변수
			if(asc >= 97 && ch <= 122) {
				for(int j=0; j<numberCode.length; j++) {     // numberCode[] 배열안에서 해당 ch를 찾기위해 반복문을 사용
					if(ch == numberCode[j]) {                
						index = j;                           // 해당 ch를 찾아 index변수에 대입
						break;
					}
				}
				index = index + 48; // 0 -> 48               // ASCII 코드값 48을 플러스 
				baseCode = baseCode + (char)index;
			}
		    else  {          // 기호 -> 알파벳이 암호화 abcCode[]
				for(int j=0; j<abcCode.length; j++) {        // abcCode[] 배열안에서 해당 ch를 찾기위해 반복문을 사용
					if(ch == abcCode[j]) {
						index = j;						     // 해당 ch를 찾아 index변수에 대입
						break;
					}
				}
				index = index + 97;							 // ASCII 코드값 97을 플러스 
				baseCode = baseCode + (char)index;
			}
		}
		
		// 복호화 출력
		System.out.println("result: "+ result);
		System.out.println("baseCode:"+ baseCode);
		
		// work 5
		// String 입력
		Scanner sc= new Scanner(System.in);
		String myNumber;
		System.out.print("myNumber = " );
		myNumber = sc.next(); 
		boolean b = false;                                // myNumber가 모두 숫자인지 아닌지 판별하기 위한 변수
		// 모두 숫자?
		// 문자가 있는지?
		for(int i=0; i<myNumber.length(); i++) {     
			char ch = myNumber.charAt(i);                 // String myNumber를 하나씩 꺼냄
			int index = (int)ch-48;                       // index는 0~9값을 넣기위한 변수 
			if(index >= 0 && index <= 9) {    //대체가능  // if(index < 0 || index >9){ 
				b = true;                      		   //       b = true;
			}                                          //       break; 
			else {                                     // }
				b = false;
				break;
			}
		}
		
		if(b==true) {                                  // if(b==true){
			System.out.println("모두 숫자입니다.");         //      System.out.println("모두 숫자는 아닙니다");
		}                                              // }
		else {
			System.out.println("모두 숫자는 아닙니다.");
		}
	
		// 출력
		// 모두 숫자입니다
		// 숫자가 아닙니다
		
		// -> 123ㅁ3 -> 숫자가 아닙니다
		// -> 345 -> 숫자입니다
	}
}





















