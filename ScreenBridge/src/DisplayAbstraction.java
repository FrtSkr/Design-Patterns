public abstract class DisplayAbstraction {
    protected ScreenMode screenMode;

    public DisplayAbstraction() {
        this.screenMode = new FullScreenMode();
    }

    public DisplayAbstraction(ScreenMode screenMode) {
        this.screenMode = screenMode;
    }

    public abstract void settingDisplayMode();

    public void setScreenMode(ScreenMode screenMode){
        this.screenMode = screenMode;
    }


}
