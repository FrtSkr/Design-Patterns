public class BMW extends Observable {
    public BMW(String productName, double productPrice) {
        super(productName, productPrice);
    }

    public void setPrice(double d){
        this.productPrice = d;
        notification();
    }
}
