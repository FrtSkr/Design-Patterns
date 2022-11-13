public class ConcreteHandlerMP4 extends PlayerHandler {
    public ConcreteHandlerMP4() {
    }

    @Override
    public void play(String filePath) {
        // dosya formatı mp4 ise çalıştıracak
        if(filePath.endsWith(".mp4")){
            System.out.println("MP4 Formatında Başlatılıyor.");
        }
        // değilse bir sonrakine yollayacak
        else {
            nextPlayerHandler.play(filePath);
        }
    }
}
