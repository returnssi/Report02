import java.util.Scanner;

public class D201412424_gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("하나의 수를 입력 받고 그 수에 해당하는 구구단을 출력합니다.");
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1; i<=9; i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
