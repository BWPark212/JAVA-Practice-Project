import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		String dec = null;
		System.out.println("구구단 실행");
		do {
			int process_type;
			do {
				System.out.println("1. 원하는 1단 출력	2. 계산출력");
				Scanner scan1 = new Scanner(System.in);
				process_type = scan1.nextInt();
			} while (process_type != 1 && process_type != 2);

			if (process_type == 1) {
				int var;
				do {
					System.out.println("2~9 사이의 숫자를 입력하세요.");
					Scanner scan2 = new Scanner(System.in);
					var = scan2.nextInt();
				} while (var < 2 || var > 9);
				for (int i = 1; i < 10; i++) {
					System.out.println(var + " * " + i + " = " + var * i + '\n');
				}
			} else {
				System.out.println("연산하고자 하는 값을 입력하세요.");
				Scanner scan3 = new Scanner(System.in);
				int var1 = scan3.nextInt();
				Scanner scan4 = new Scanner(System.in);
				int var2 = scan4.nextInt();
				System.out.println("결과값 : " + var1 * var2);
			}
			System.out.println("프로그램 종료? Y/N");
			Scanner scan5 = new Scanner(System.in);
			dec = scan5.nextLine();
			dec = dec.toUpperCase(); // 입력값 대문자로 변환
		} while (dec.equals("N"));
	}
}
