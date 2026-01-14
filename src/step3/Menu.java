package step3;

import java.util.Scanner;

public class Menu {

    private final Scanner sc = new Scanner(System.in);
    private final ArithmeticCalculator calculator = new ArithmeticCalculator();

    public void start() {
        System.out.println("=== 계산기 메뉴 ===");
        System.out.println("1. 계산하기");
        System.out.println("2. 계산 기록 보기");
        System.out.println("3. 가장 처음 기록 삭제하기");
        System.out.println("0. 종료하기");
        System.out.println("=================");
        while (true) {
            System.out.print("계산기 메뉴를 선택하시오: ");
            int answer = Integer.parseInt(sc.nextLine());
            // TODO: 예외처리 필요

            switch (answer) {
                case 1:
                    calculate();
                    break;
                case 2:
                    getHistory();
                    break;
                case 3:
                    removeResult();
                    break;
                case 0: {
                    System.out.println("종료하시겠습니가? (exit 입력 시 종료): ");
                    String response = sc.nextLine();
                    if (response.equalsIgnoreCase("exit")) {
                        System.out.println("계산기를 종료합니다.");
                    }
                    return;
                }
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void calculate() {
        // TODO: 예외처리 필요 num1, num2, operator
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
        char operator = sc.nextLine().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = Double.parseDouble(sc.nextLine());

        double result = calculator.calculate(num1, num2, operator);
        calculator.setHistory(result);

        System.out.println("결과: " + result);
    }

    public void getHistory() {
        System.out.println("--계산 기록--");
        System.out.println(calculator.getHistory());
    }

    public void removeResult() {
        calculator.removeResult();
        System.out.println("삭제되었습니다.");
        System.out.println("--계산 기록--");
        System.out.println(calculator.getHistory());
    }
}
