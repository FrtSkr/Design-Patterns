public class Main {

    public static void main(String[] args) {

        Customer customer1 = new CustomerFirst("Fırat Şakar", "a@a.com");
        Customer customer2 = new CustomerSecond("Can Baylan", "b@b.com");

        Product product1 = new ProductFirst("MacBook", 23000.15);
        Product product2 = new ProductSecond("Lenovo", 14000.99);

        product1.addCustomer(customer1);
        product1.addCustomer(customer2);
        product2.addCustomer(customer2);
        product1.setProductPrice(13000.99);
        product2.setProductPrice(13999.99);
    }
}
