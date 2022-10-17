package at.stderr.Constructors;

public class VipCustomer {
    private double creditLimit;
    private String name;
    private String eMail;

    public VipCustomer(double creditLimit, String name, String eMail) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.eMail = eMail;
    }

    public VipCustomer(String name, String eMail) {
        this(0.0, name, eMail);
    }

    public VipCustomer() {
        this(0.0, "Max Mustermann" , "max@mustermann.com");
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "creditLimit=" + creditLimit +
                ", name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
