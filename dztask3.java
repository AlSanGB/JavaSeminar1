// Реализовать простой калькулятор
import java.util.Scanner;
public class dztask3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число, с которым нужно произвести математическое действие: ");
        float n1 = iScanner.nextFloat();
        System.out.printf("Введите второе число, с которым нужно произвести математическое действие: ");
        float n2 = iScanner.nextFloat();
        System.out.printf("Введите операцию (+, -, *, /): ");
        String oper = iScanner.next();
        float res = 0;
        switch (oper) {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;        
            default:
                System.out.printf("Вы ввели неподдерживаемую операцию!");
            break;
        }
        System.out.printf("Результат: %.3f", res);
        iScanner.close();
    }
}