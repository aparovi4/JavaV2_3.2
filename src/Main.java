import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int account = 100;
        int replenishment = 1100;
        int bonus;
        if (replenishment > 1000) {
        bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int result = account + replenishment + bonus;
        System.out.println("Начисленно " + bonus + " бонуса(ов). На счету " + result + " рубля(ей).");
    }
}