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

