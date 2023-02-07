import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int nachalnSchet = 100;
        int popolnenie = 600;
        int bonus;
        if (popolnenie >= 1000)
        {
            bonus = popolnenie / 100;
        }
        else bonus = 0;
        int itogSchet = nachalnSchet + popolnenie + bonus;

        System.out.println("Итого на счете: " + itogSchet);
        System.out.println("Начислено бонусов: " + bonus);
    }
}