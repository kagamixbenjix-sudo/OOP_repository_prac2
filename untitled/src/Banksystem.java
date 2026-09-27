import java.time.LocalDate;

public class Banksystem {

    String Customername;
    int customerdeposit;
    String phoneNumber;
    String email;
    LocalDate depositDate;

    public Banksystem(String Customername, int customerdeposit,
                      String phoneNumber, String email) {

        this.Customername = Customername;
        this.customerdeposit = customerdeposit;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.depositDate = LocalDate.now();
    }

    public double calculateInterest(int interestRate) {

        // Implicit conversion: int deposit is automatically converted to double
        double depositasdouble = customerdeposit;

        double customerinterest =
                (depositasdouble * interestRate) / 100.0;

        return customerinterest;
    }

    public double getBalance(int interestRate) {

        double interest = calculateInterest(interestRate);

        return customerdeposit + interest;
    }

    public double withdraw(int amount, int interestRate) {

        double balance = getBalance(interestRate);

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("insufficient funds !");
        }

        return balance;
    }
    public void displayCustomerDetails(int interestRate) {

        System.out.println("Customer Name: " + Customername);
        System.out.println("Deposit Amount: " + customerdeposit);
        System.out.println("Deposit Date: " + depositDate);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Interest Rate: " + interestRate + "%");

        double customerinterest = calculateInterest(interestRate);

        System.out.println("Calculated Interest: " + customerinterest);

        // Explicit conversion: double to int
        int roundedinterest = (int) customerinterest;

        System.out.println(
                "Interest after the explicit conversion: " + roundedinterest
        );

        System.out.println(
                "Customer Balance: " + getBalance(interestRate)
        );
    }
    public static void main(String[] args) {

        Banksystem BK1 = new Banksystem(
                "John Doe",
                1050,
                "0700000001",
                "john.doe@gmail.com"
        );

        Banksystem BK2 = new Banksystem(
                "Jane Smith",
                2055,
                "0700000002",
                "jane.smith@gmail.com"
        );

        Banksystem BK3 = new Banksystem(
                "Alice Johnson",
                1555,
                "0700000003",
                "alice.johnson@gmail.com"
        );
