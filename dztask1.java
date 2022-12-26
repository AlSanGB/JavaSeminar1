// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class dztask1 {
    public static int trgsum(int n) {
        int nChislo = 1;
        for (int i=2;i<=n;i++) {
            nChislo += i;
        }
        return nChislo;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число, для которого вычислить треугольное число: ");
        int n = iScanner.nextInt();
        System.out.printf("%d-е треугольное число равно: %d", n, trgsum(n));
        iScanner.close();
    }
}
