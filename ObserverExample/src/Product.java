import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private String productName;
    private double productPrice;
    protected List<Customer> customerList;
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.customerList = new ArrayList<>();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }

    public void removeCustomer(Customer customer){
        this.customerList.remove(customer);
    }

    public abstract void notifyProduct();


}
