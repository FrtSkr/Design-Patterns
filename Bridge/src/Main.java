public class Main {

    public static void main(String[] args) {
        VideoAbstraction video = new VideoRefinedAbstraction();
        video.ShowScreen(); // dont null pointer exception... :))

        video.setVideoMode(new Direct3DMode());
        video.ShowScreen();
        video.setVideoMode(new OpenGLMode());

        video.ShowScreen();





    }
}
