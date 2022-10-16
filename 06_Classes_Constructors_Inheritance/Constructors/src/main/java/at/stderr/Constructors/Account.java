package at.stderr.Constructors;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public Account() {
        this("56789", 0.0, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor");
    }

    public Account(String number, double balance, String customerName, String eMail, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdrawFunds(double amount){
        double newBalance = balance - amount;
        if (newBalance < 0) {
            return -1.0;
        }

        this.balance = newBalance;
        return this.balance;
    }

}
