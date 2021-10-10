public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 5000;
        int total = x + y;
        int bonus;
        boolean b = true;
        if (total > 1000) {
            bonus = total * 1 / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = total + bonus;
        System.out.println(totalBalance);
        System.out.println(bonus);
    }
}