public class ConcreteHandlerAVI extends PlayerHandler {
    public ConcreteHandlerAVI() {
    }

    @Override
    public void play(String filePath) {
        // AVI Formatında ise çalıştırılacak
        if(filePath.endsWith(".avi")){
            System.out.println("AVI Formatında Başlatılıyor.");
        }
        // Değilse zincirdeki son yapı olduğu için hata mesajı üretecek
        else{
            System.out.println("Dosya tipi hatalıdır!!!");
        }
    }
}
