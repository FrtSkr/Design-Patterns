public class ProductFirst extends Product {
    public ProductFirst(String productName, double productPrice) {
        super(productName, productPrice);
    }

    @Override
    public void setProductPrice(double productPrice) {
        if(getProductPrice() > productPrice){
            notifyProduct();
        }

        super.setProductPrice(productPrice);

    }


    @Override
    public void notifyProduct() {
        for (Customer c: customerList) {
            c.update(this);
        }
    }
}
