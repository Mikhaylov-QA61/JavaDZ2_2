public class Main {
    public static void main(String[] args) {

        int customerbalance = 100;
        int refill = 1366;

        if (refill > 1000 ){
            customerbalance=customerbalance + refill + (refill / 100);
        }
        else {
            customerbalance=customerbalance + refill;
        }

        System.out.println("Вы пополнили счет на " + refill + " рублей(я)");
        System.out.println("Баланс Вашего счета состовляет " + customerbalance + "рублей(я)" );
    }
}