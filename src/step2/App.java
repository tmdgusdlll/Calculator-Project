package step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = Integer.parseInt(sc.nextLine());

        int result = cal.calculate(num1, num2, operator);
        System.out.println("결과: " + result);

        System.out.println("더 계산하시겠습니가? (exit 입력시 종료)");
    }
}
