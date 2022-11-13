public class Main {

    public static void main(String[] args) {
        // Zincir yapısı için gerekli nesneler oluşturuldu
        PlayerHandler mp4 = new ConcreteHandlerMP4();
        PlayerHandler mpg = new ConcreteHandlerMPG();
        PlayerHandler avi = new ConcreteHandlerAVI();

        // Zincir yapısı kuruldu. Zincirin başı mp4 sınıfı, sonu ise avi sınıfıdır.
        mp4.setNextPlayerHandler(mpg);
        mpg.setNextPlayerHandler(avi);

        // zincirin başı mp4 olarak oluşturulduğu için gelecek istek ilk olarak o sınıfa uğrayacaktır.
        mp4.play("file.avi");
        mp4.play("file.mp4");
        mp4.play("file.mpg");
        // Dosya tipi uygun olmadığından son zincire kadar gidilecek ve hata mesajı yazdırılacak.
        mp4.play("file.wmv");

    }
}
