public abstract class Customer {
    private  String custName;
    private String custEmail;

    public Customer(String custName, String custEmail) {
        this.custName = custName;
        this.custEmail = custEmail;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public abstract void update(Product product);
}
