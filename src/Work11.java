import java.util.Scanner;
import java.util.Arrays;

public class Work11 {

	public static void main(String[] args) {
		/*
		    Baseball Game
		    
		    1 ~ 10 -> 3개
			
			random      user
		    7  1  6 -> 1  4  5  = 1 ball
		    		-> 7  3  4  = 1 strike
		    		-> 7  2  1  = 1 strike 1 ball 
		    		
		    rnum1 != rnum2 != rnum3
		 */			 
		/*
		// 내가 쓴 코드
		// 1. reandom -> 3개(다른 숫자)
		int numRan[] = new int[3];
		int numUse[] = new int[3];

		while(true) {
			boolean b = true; 
			for(int i=0;i<numRan.length; i++) {
				numRan[i] = (int)(Math.random()*10)+1;
			}
			if( numRan[0] == numRan[1] || numRan[1] == numRan[2] || numRan[2] == numRan[0]) {    // 숫자가 같으면 다시 입력
				b = false;
			}
			else if(b==true) {
				break;
			}
		}
		for(int i=0; i<numRan.length; i++) {
			System.out.print(numRan[i] + " ");
		}
		
		///////////////////////////////////////// ioop
		System.out.println("야구게임 시작!!");
		while(true) {
			boolean b = true;
			
			int ball = 0;        // ball 카운트 변수
			int strike = 0;      // strike 카운트 변수
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i<numUse.length; i++) {                        // 숫자 입력을 위한 반복문
				System.out.print("1~9사이의 숫자를 입력하세요: ");
				numUse[i] = sc.nextInt();
				if( numUse[i]<1 || numUse[i]>10  ) {                      // 숫자가 입력되면 다시 입력
					b=false;
					System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력하세요");      
					break;
				}
			}
			
			// 비교
			for(int i=0; i<numRan.length; i++) {
				for(int j=0; j<numUse.length; j++) {
					if( numRan[i] == numUse[j] && i==j ) {           // 배열의 수와 자리가 다 맞을 경우 strike 카운트
						strike++;
					}
					else if( numRan[i] == numUse[j] && i != j) {      // 배열의 수만 맞고 자리는 틀리는 경우 ball 카운트
						ball++;
					}
				}
			}
			// 결과 출력
			System.out.println("ball = "+ ball + "," +"strike ="+ strike);
			if(strike == 3) {            // 정답을 맞췄을 경우 while을 빠져 나간다.
				System.out.println("축하합니다!! 게임을 클리어 하셨습니다!!");
				break;
			}
		}
		// 2. user input -> 3개(다른 숫자)
		
				// 3. 비교
				
				// 4. 메시지
				
				// 5. 결과 출력
		*/
		
		// 강사님 코드
		Scanner sc= new Scanner(System.in);
		int r_num[] = null;
		int u_num[] = null;
		boolean clear;
	
		// initialize 초기화
		r_num = new int[3];
		u_num = new int[3];
		clear = false;
		
		// random 3개
		/*
		// 1.
		while(true) {
			r_num[0] = (int)(Math.random()*10)+1;
			r_num[1] = (int)(Math.random()*10)+1;
			r_num[2] = (int)(Math.random()*10)+1;
			
			if(r_num[0] != r_num[1] && r_num[0] != r_num[2] && r_num[1] != r_num[2] ) {
				break;	
			}
		}
		
	//	for(int i =0; i<r_num.length; i++) {
	//		System.out.println("r_num["+ i+ "] =" +r_num[i]);
	//	}
		
		System.out.println(Arrays.toString(r_num));
		*/
		// 2.
		/*
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<1000;i++) {
			int x = (int)(Math.random()*10);
			int y = (int)(Math.random()*10);
			
			int temp;
			temp = array[x];
			array[x] = array[y];
			array[y] = temp;
		}
		
		r_num[0]= array[0];
		r_num[1]= array[1];
		r_num[2]= array[2];
		
		System.out.println(Arrays.toString(r_num));
		*/
		
		// 3. 실무에서 쓰이는 방법*  -> 숫자를 섞는데 유용한 코드이다!!
		boolean swit[]= new boolean[10];  // 전부 false로 초기화
		int r, w;
		
		w=0;
		
		while(w<3) {
			r = (int)(Math.random()*9);  // 0 ~9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r+1 ;          // 1~10 사이 수 저장
				w++;
			}
		}
		System.out.println(Arrays.toString(r_num));
		int loop=0;
		
		while(loop<10) {
			// user input
			while(true) {
				for(int i=0; i<u_num.length ;i++) {
					System.out.print((i+1) + "번째 수 =");
					u_num[i] = sc.nextInt();
				}
				if(u_num[0] == u_num[1] || u_num[0] == u_num[2] || u_num[1] == u_num[2] ) {
					System.out.println("같은 숫자가 존재합니다. 다시 입력해 주십시오");
					continue;
				}
				break;
			}
			
			// 비교
			int strike = 0, ball = 0;
			
			// ball
			for(int i=0; i<r_num.length; i++) {
				for(int j=0; j< u_num.length; j++) {
					if(u_num[i]==r_num[j] && i != j){
						ball++;
					}
				}
			}
			// strike
			for(int i=0; i<r_num.length; i++) {
				if(u_num[i] == r_num[i]) {
					strike++;
				}
			}
			
			// 정답을 맞췃을 때
			if(strike > 2) {
				clear = true;
			}
			
			// 메시지
			System.out.println(strike + "스트라이크"+ ball +"볼 입니다");
			
			loop++;
			
			// 결과 출력
			if(clear) {
				System.out.println("Game Clear!!!");
			}
			else {
				System.out.println("Game Over...");
			}
		}
	}
}
























