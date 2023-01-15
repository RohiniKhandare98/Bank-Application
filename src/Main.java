import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name  , password , balance to create an account");

        String name =sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();

        SBIUser sbiuser = new SBIUser(name , balance , password);

        // add amount
        String message = sbiuser.addMoney(10000);
        System.out.println(message);

        // withdraw money
        System.out.println("Enter password ");
        String p = sc.nextLine();

//        System.out.println("Enter amount which u want to withdraw ");
        int money = sc.nextInt();

        System.out.println(sbiuser.withdrawMoney(money , p));




    }

}