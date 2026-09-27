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
