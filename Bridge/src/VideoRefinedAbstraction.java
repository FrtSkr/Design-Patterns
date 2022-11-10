public class VideoRefinedAbstraction extends VideoAbstraction {

    @Override
    public void ShowScreen() {
        if(getVideoMode() == null)  setVideoMode(new OpenGLMode());
        getVideoMode().GetScreen();
    }


}

