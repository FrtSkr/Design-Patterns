public class VideoAbstraction {

    private IVideoMode videoMode;

    public void ShowScreen(){
        if(videoMode == null) videoMode = new OpenGLMode();

        videoMode.GetScreen();

    }

    public void setVideoMode(IVideoMode videoMode) {
        this.videoMode = videoMode;
    }

    public IVideoMode getVideoMode() {
        return videoMode;
    }
}
