import java.util.Scanner;

public class Work9 {

	public static void main(String[] args) {
		/*
		   Random number 찾기
		   
		   random -> 1~100 중 하나를 뽑는다 :유저는 모른다
		   ex)
		   >> 10번 기회
		   user input -> 50, output -> 너무 작습니다.
		   user input -> 75, output -> 너무 작습니다.
		   user input -> 85, output -> 너무 큽니다
		   user input -> 80, output -> 너무 큽니다
		   user input -> 77, output -> 너무 작습니다.
		   user input -> 78, output -> 정답입니다!!
		 */
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1; // random 1~100중 하나를 뽑는다.
		int n; // 사용자의 input 변수
		boolean b; // restart 판단을 위한 변수
		
		for(int i=0; i<=11; i++) {                                 // 기회는 10번, 마지막 11번째에 사용자의 restart를 판단
			// 기회를 모두 썻을 경우
			if (i == 11) {                                         // 10번의 기회를 모두 소진!! 한번 더 도전 할 것 인가?
				System.out.println("기회를 모두 쓰셨습니다.");
				System.out.print("한번더는 true, 그만하기는 false =");
				b = sc.nextBoolean();                             // true 또는 false를 입력
				if(b == true) {                                   // true 일 경우 한번 더 도전
					i=0;                                          // 기회를 다시 초기화
					System.out.println("one more!!");
					continue;
				}
				else if(b == false) {							  // false일 경우 그만하기
					System.out.println("그만 할래요...");
					break;
				}
			}
			
			// 비교!
			System.out.print("user number = ");        
			n = sc.nextInt();                    // user input
			if(n > num) {					     // 사용자가 입력한 수가 클 경우
				System.out.println("너무 큽니다");
				continue;
			}
			else if(n < num) {                   // 사용자 입력할 수가 작을 경우
				System.out.println("너무 작습니다");
				continue;
			}
			else if(n ==num) {                   // 사용자가 정답을 맞췄을 경우
				System.out.println("정답입니다!! " + (i+1) + "번만에 맞췄습니다");
				break;
			}
		}
	}

}























