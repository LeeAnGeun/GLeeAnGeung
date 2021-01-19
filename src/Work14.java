import java.util.Scanner;
public class Work14 {

	public static void main(String[] args) {
		/*
		   학생성적관리
		   
		   몇명? <- 입력
		   과목 (국어, 영어, 수학)
		   
		   총점
		   평균
		   수학점수 최고점수
		   영어점수 최하점수
		 */
		Scanner sc= new Scanner(System.in);
		
		int num; // 몇명?
		System.out.print("학생 수 : ");
		num=sc.nextInt();
		String obj[] = {"국어", "영어", "수학"};
		int stu[][] = new int[num][3];  // 학생 num명의 국,영,수 성적 배열
		
		// 학생당 과목 성적 입력
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생"+(i+1)+"의 성적입니다.");
			
			for(int j=0; j<stu[i].length; j++) {
				System.out.print(obj[j] + "성적 : " );
				stu[i][j] = sc.nextInt(); 
			}
		}
		
		// 총점
		int sum;
		for(int i=0; i<stu.length; i++ ) {
			sum=0;
			System.out.print("학생"+(i+1)+"의 총점 = ");
			
			for(int j=0; j<stu[i].length; j++) {
				sum += stu[i][j];
			}
			System.out.println(sum);
		}
		// 평균
		float avg;
		for(int i=0; i<stu.length; i++ ) {
			avg=0;
			sum=0;
			System.out.print("학생"+(i+1)+"의 평균 = ");
			
			for(int j=0; j<stu[i].length; j++) {
				sum += stu[i][j];
			}
			avg = (float)sum / 3;
			System.out.println(avg);
		}
		
		// 수학 최고점수
		int max = stu[0][2];
		for(int i=1; i<stu.length; i++) {
			if(max<stu[i][2])
				max = stu[i][2];
		}
		System.out.println("수학 최고점수 :" + max);
		// 영어 최하점수
		int min = stu[0][1];
		for(int i=1; i<stu.length; i++) {
			if(min>stu[i][1]) 
				min = stu[i][1];
		}
		System.out.println("영어 최하점수 : " + min);
		
	}

}
