import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("Введите арифметическое выражение вида : a + b, a - b, a * b, a / b");
        String vyr = scan.nextLine();
        System.out.println(calc(vyr));
    }
    static String result;
    public static String calc(String vyr){
        Obrabotka obrabotka = new Obrabotka(vyr);
        obrabotka.formatir1();
        result = obrabotka.formatir2();
        return result;
    }
}
