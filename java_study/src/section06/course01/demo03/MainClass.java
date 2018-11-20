package section06.course01.demo03;

public class MainClass {
    /**
     * 两个人AB通过账户A在柜台取钱和B在ATM机取钱
     */
    public static void main(String[] args) {
        Bank bank = new Bank();

        PersonA pA = new PersonA(bank);
        PersonB pB = new PersonB(bank);

        pA.start();
        pB.start();
    }
}
