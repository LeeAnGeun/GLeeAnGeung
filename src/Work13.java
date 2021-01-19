import java.util.Arrays;
import java.util.Scanner;

public class Work13 {

	public static void main(String[] args) {
		/*
		   2차원 배열 -> 1차원 배열  // 자주 있는 작업이다!!
		   arr2[0][0] -> arr1 [0]  arr2[0].length * i + j
		   arr2[0][1] -> arr1 [1]  arr2[0].length * i + j
		   .
		   .
		   .
		   .
		   .
		   .
		 */
		Scanner sc = new Scanner(System.in);
		int arr2[][] = {
				{11,22,33,44},
				{55,66,77,88},
				{99,111,222,333}
		};
		
		int arr1[] = new int[arr2.length * arr2[0].length];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
			arr1[arr2[i].length*i +j] = arr2[i][j];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
