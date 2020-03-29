import java.util.Scanner;

public class D201412424_leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("년도를 입력하시면 해당년도가 윤년인지, 평년인지 알려드립니다.");
		System.out.println("0이하의 숫자가 입력되면 프로그램은 종료됩니다.");
		System.out.print("년도 입력 :");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년 윤년");
		} else {
			System.out.println(year + "년 평년");
		}
	}
}