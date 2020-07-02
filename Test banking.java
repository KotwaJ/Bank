import java.util.HashSet;

public class TestBanking {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account acc1 = new Account(5000);
        Account acc2 = new Account(1500);
        Account acc3 = new Account(5200);
        Account acc4 = new Account(1240);
        Account acc5 = new Account(5040);
        Account acc6 = new Account(500);
        Account acc7 = new Account(100);
        Account acc8 = new Account(200);
        Account acc9 = new Account(6700);
        Account acc10 = new Account(800);
        Account acc11 = new Account(5000);
        bank.addCustomer("Piotr", "Kowalski");
        bank.addCustomer("Norbert", "Gierczak");
        bank.addCustomer("Anna", "Nowak");
        bank.addCustomer("Marysia", "Kotwa");
        bank.addCustomer("Adam", "Wojcik");

        bank.setAccount(0,acc1);
        bank.setAccount(0,acc2);
        bank.setAccount(0,acc3);
        bank.setAccount(1,acc4);
        bank.setAccount(1,acc5);
        bank.setAccount(2,acc6);
        bank.setAccount(3,acc7);
        bank.setAccount(3,acc8);
        bank.setAccount(4,acc9);
        bank.setAccount(4,acc10);
        System.out.println(bank.getCustomers());


    }
}
