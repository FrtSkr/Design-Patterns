public class CustomerFirst extends Customer {

    public CustomerFirst(String custName, String custEmail) {
        super(custName, custEmail);
    }

    @Override
    public void update(Product product) {
        System.out.println("Sayın "+this.getCustName()+"; "+product.getProductName() + " ürünün fiyatı düştü");
    }
}
