package basic.if_;

import java.util.Scanner;
/**
 * 2023.02.21-2.
 * IF 조건문 01
 */
public class IfExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");
		System.out.println("--------------------------------");
		
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격하셨습니다!");
		} else {
			System.out.println("70점 미만입니다.");
			System.out.println("불합격입니다. ㅠ^ㅠ");
		}
		
		System.out.println("시험 치르느라 수고하셨습니다~");
		
		
		
		sc.close();
	

	}

}
