public class TOGG extends Observable {
    public TOGG(String productName, double productPrice) {
        super(productName, productPrice);
    }

    public void setPrice(double d){
        this.productPrice = d;
        notification();
    }
}
