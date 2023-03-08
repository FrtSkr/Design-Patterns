public class ProductSecond extends Product {
    public ProductSecond(String productName, double productPrice) {
        super(productName, productPrice);
    }

    @Override
    public void setProductPrice(double productPrice) {
        if (getProductPrice() > productPrice) {
            notifyProduct();
        }
        super.setProductPrice(productPrice);
    }

    @Override
    public void notifyProduct() {
        for (Customer c : customerList) {
            c.update(this);
        }
    }
}
