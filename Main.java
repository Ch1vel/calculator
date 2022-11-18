import java.util.Scanner;

public class Main {
    private static String result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("Введите арифметическое выражение вида : a + b, a - b, a * b, a / b");
        String vyr = scan.nextLine();
        System.out.println(calc(vyr));
    }

    public static String calc(String vyr) {
        CheckInputString check = new CheckInputString(vyr);
        try {
            check.toSubStrings();
            check.checkMath();
            check.toInt();
            result = check.resultToString();
        } catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return result;
    }
}
