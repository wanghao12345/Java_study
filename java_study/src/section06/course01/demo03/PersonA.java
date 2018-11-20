package section06.course01.demo03;

public class PersonA extends Thread {

    Bank bank;

    public PersonA(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run () {
        while (Bank.money >= 100) {
            bank.Counter(100);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
