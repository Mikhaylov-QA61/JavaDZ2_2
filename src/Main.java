public class Main {
    public static void main(String[] args) {

        int customerBalance = 100;
        int refill = 1366;

        if (refill > 1000) {
            customerBalance = customerBalance + refill + (refill / 100);
        } else {
            customerBalance = customerBalance + refill;
        }

        System.out.println("Вы пополнили счет на " + refill + " рублей(я)");
        System.out.println("Баланс Вашего счета состовляет " + customerBalance + "рублей(я)");
    }
}