public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1698;
        int bonus = depositAmount / initialAccount;
        int finalAccount;
        if (depositAmount > 1000) {
            finalAccount = initialAccount + depositAmount + bonus;
        } else {
            finalAccount = initialAccount + depositAmount;
        }
        if (depositAmount > 1000) {
            System.out.println("Бонус: " + bonus);
        }
        System.out.println("Итоговый счет: " + finalAccount);
    }
}
