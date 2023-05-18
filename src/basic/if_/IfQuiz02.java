package basic.if_;

import java.util.Scanner;

/**
 * 2023.02.21-5.
 * IF 조건문 QUIZ 02
 */
public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰지 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수: 4, 7 -> 7이 큰 수 입니다.
		 입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수: 5, 5 -> 같은 수 입니다.
		 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요: ");
		int first = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int second = sc.nextInt();
		
		if(first == second) {
			System.out.println("같은 수 입니다.");
		} else if(first > second) {
			System.out.println(first + "이 큰 수 입니다.");
		} else {
			System.out.println(second + "이 큰 수 입니다.");
		}
				
		
		sc.close();
		
	}

}
