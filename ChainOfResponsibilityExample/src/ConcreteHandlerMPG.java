public class ConcreteHandlerMPG extends PlayerHandler{
    public ConcreteHandlerMPG() {
    }

    @Override
    public void play(String filePath) {

        // MPG formatında ise çalıştırılacak
        if(filePath.endsWith(".mpg")){
            System.out.println("MPG Formatında Başlatılıyor.");
        }
        // Değilse bir sonrakine aktaracak
        else{
            nextPlayerHandler.play(filePath);
        }
    }
}
