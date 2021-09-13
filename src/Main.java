public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1100;
        int bonus = depositAmount / initialAccount;
        int finalAccount;
        if (depositAmount > 1000) {
            finalAccount = initialAccount + depositAmount + bonus;
        } else {
            finalAccount = initialAccount + depositAmount;
        }
        System.out.println(finalAccount);
    }
}
