import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int initialScore = 100;
        int replenishment = 600;
        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int finalScore = initialScore + replenishment + bonus;

        System.out.println("Итого на счете: " + finalScore);
        System.out.println("Начислено бонусов: " + bonus);
    }
}