import java.util.Scanner;
public class Work12 {

	public static void main(String[] args) {
		/*
		    가위 바위 보
		    
		    random -> 1
		    
		    user -> 1
		    
		    판정
		    win/lose/draw
		    
		    결과
		    ?승?패?무
		 */
		Scanner sc=new Scanner(System.in);
		
		String rsp[] = {"바위", "가위", "보" }; 
		int win=0;   // 승리 횟수 변수
		int lose=0;   // 패 횟수 변수
		int draw=0;    // 비김 횟수 변수

		while(true) {
			// 입력
			// 컴퓨터 input
			int com = (int)(Math.random()*3);
			System.out.println("com = " + rsp[com]);

			// 사용자 input
			int use;
			System.out.print("useinput = ");
			use = sc.nextInt();
			if(use<0 || use>2) {
				System.out.println("잘못 내셨습니다. 다시 내십시오");
				continue;
			}
			System.out.println("use = " + rsp[use]);
			// 1. 판단
			if(com==0) {       // com이 바위를 냈을 경우
				if(use==0) {   // 사용자 바위
					System.out.println("비겼습니다.");
					draw++;
				}
				else if(use==1) {  // 사용자 가위
					System.out.println("졋습니다...");
					lose++;
				}
				else if(use==2) {  // 사용자 보
					System.out.println("이겼습니다!!");
					win++;
				}
			}
			else if(com==1) {       // com이 가위를 냈을 경우
				if(use==0) {      //사용자 바위
					System.out.println("이겼습니다!!");
					win++;
				}
				else if(use==1) {  // 사용자 가위
					System.out.println("비겼습니다.");
					draw++;
				}
				else if(use==2) {   // 사용자 보
					System.out.println("졌습니다...");
					lose++;
				}
			}
			else if(com==2) {     // com이 보를 냈을 경우
				if(use==0) {      // 사용자 바위
					System.out.println("졌습니다...");
					lose++;
				}
				else if(use==1) {    // 사용자 가위
					System.out.println("이겼습니다!!");
					win++;
				}
				else if(use==2) {     // 사용자 보
					System.out.println("비겼습니다.");
					draw++;
				}
			}
			// 2. 판단 공식
			
			// use 0(가위) 1(바위) 2(보)
			/*
			 win 0-2 1-0 2-1
			    com           use
			     2      -      0   +2     = 4%3 -> 1
			     0      -      1   +2     = 1%3 -> 1
			     1      -      2   +2     = 1%3 -> 1
			 lose
			     2-0 0-1 1-2
			     0      -      2   +2    = 0%3 -> 0
			     1      -      0   +2    = 3%3 -> 0  
			     2      -      1   +2    = 3%3 -> 0
			 draw 
			     0-0 1-1 2-2
			     0      -      0   +2     = 2%3 -> 2
			     1      -      1   +2     = 2%3 -> 2
			     2      -      2   +2     = 2%3 -> 2
			 */
			
			// 사용자가 5번 이상 승리했을 경우
			// 결과 출력
			if(win >4) {
				System.out.println("승리를 5번하셨습니다!!");
				System.out.println("win :" + win + " " + "lose :" + lose + " " + "draw :" + draw );
				System.out.println("win = "+ win + " "+ "lose = "+ lose + " "+ "draw = " + draw );
				
				System.out.print("한판더 하시겠습니까(y/n)? =");
				String str = sc.next();
				
				if(str.equals("n") ||str.equals("N")) {
					System.out.println("안녕히 가십시오");
					break;
				}
				else {
					System.out.println("새로운 한판!!");
					win = lose = draw = 0;
				}
			}
			
		}
		
		// 알고리즘 4대 (정렬(sort), 셔플, 이진트리, 탐색)
		// stack, queue
	}

}
