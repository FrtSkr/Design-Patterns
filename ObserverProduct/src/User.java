public class User extends Observer{

    public User(String userName) {
        super(userName);
    }

    @Override
    public void sendNotify(String productName) {
        System.out.println("Sayın "+this.userName+", "+productName+" ürününün fiyatı güncellenmiştir.");
    }
}
