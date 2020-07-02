public class Account {

    private double balance;

    Account(double balance){
        this.balance = balance;
        System.out.println("Tworzenie konta z saldem: "+ balance);
    }
    public boolean deposit(double depozyt ){
        if(depozyt < 0){
            System.out.print("Wpłata: " + depozyt +": ");
            return false;
        }else {
                balance = balance+depozyt;
            System.out.print("Wpłata: "+ depozyt +": ");
            return true;
        }
    }
    public boolean withdraw(double pobranie){

        if(pobranie< balance && pobranie > 0) {
            balance = balance - pobranie;
            System.out.print("Wypłata : " + pobranie +": ");
            return true;
        }else{
            System.out.print("Wypłata : " + pobranie +": ");
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "Account " +  "current balance is " + balance +"\n";
    }
}
