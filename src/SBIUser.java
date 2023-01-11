import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String name;
    private String accountNo;
    private double balance;
   private String password;
   private static double rateOfInterest;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest= 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;

        return " new total balance is : " +balance;
    }

    @Override
    public String withdrawMoney(int money, String enteredPassword) {
        if(Objects.equals(enteredPassword , password));

        return "balance after withdrawn : " + (balance - money);
    }

    @Override
    public double calculateInterest(int years) {

        return (balance * years * rateOfInterest)/100;
    }
}
