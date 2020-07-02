import java.util.ArrayList;

public class Customer {

    private  String firstName;
    private String lastName;
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account account;

    Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
        System.out.println("Tworzenie klienta " +firstName+" "+ lastName );
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void addAccount(Account konto) {
        accounts.add(konto);
    }

    public String toString(){
        String dane = this.getFirstName() + " "+ this.getLastName();
        String konta =" ";
        for(int i =0; i<accounts.size();i++){
            konta = konta + (" "+(i+1)+" " + accounts.get(i).toString()+"");
        }
        return dane +"\n"+ konta;
    }
}
