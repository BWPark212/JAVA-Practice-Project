import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		String dec = null;
		System.out.println("������ ����");
		do {
			int process_type;
			do {
				System.out.println("1. ���ϴ� 1�� ���	2. ������");
				Scanner scan1 = new Scanner(System.in);
				process_type = scan1.nextInt();
			} while (process_type != 1 && process_type != 2);

			if (process_type == 1) {
				int var;
				do {
					System.out.println("2~9 ������ ���ڸ� �Է��ϼ���.");
					Scanner scan2 = new Scanner(System.in);
					var = scan2.nextInt();
				} while (var < 2 || var > 9);
				for (int i = 1; i < 10; i++) {
					System.out.println(var + " * " + i + " = " + var * i + '\n');
				}
			} else {
				System.out.println("�����ϰ��� �ϴ� ���� �Է��ϼ���.");
				Scanner scan3 = new Scanner(System.in);
				int var1 = scan3.nextInt();
				Scanner scan4 = new Scanner(System.in);
				int var2 = scan4.nextInt();
				System.out.println("����� : " + var1 * var2);
			}
			System.out.println("���α׷� ����? Y/N");
			Scanner scan5 = new Scanner(System.in);
			dec = scan5.nextLine();
			dec = dec.toUpperCase(); // �Է°� �빮�ڷ� ��ȯ
		} while (dec.equals("N"));
	}
}
