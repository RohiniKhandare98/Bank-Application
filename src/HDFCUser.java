public class HDFCUser implements BankInterface{

    @Override
    public double checkBalance() { // hdfc
        return 0;
    }

    @Override
    public String addMoney(int amount) {
        return null;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
