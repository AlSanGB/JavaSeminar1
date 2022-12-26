// Вывести все простые числа от 1 до 1000 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dztask2 {
    public static void main(String[] args) {
        int n = 10000;
        List<Integer> prostoList = new ArrayList<>(Arrays.asList(1));;
        if (n>1) prostoList.add(2);
        if (n>2) {
            for (int i=3;i<=n;i++){
                int delitelCount = 0;
                for (int el : prostoList){
                    if (i % el == 0){
                        delitelCount++;
                        if (delitelCount > 1) break;
                    }
                }
                if (delitelCount == 1) prostoList.add(i);
            }
        }
        System.out.printf("Простые числа до %d: ", n);
        for (int i : prostoList) System.out.print(i + " ");
    }
}
