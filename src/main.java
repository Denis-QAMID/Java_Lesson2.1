public class main {
    public static void main(String[] args) {
        int amount = 1100;
        int present = 100;
        int bonus = amount / present;
        int balance = 100;
        if (amount >= 1000) {
            int summa = amount + bonus + balance;
            System.out.println("остаток на счету : " + summa);

        } else {
            System.out.println("остаток на счету: " + balance);

        }
        System.out.println();
    }
}
